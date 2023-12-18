import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner(System.in);
		// PrintWriter pwriter = new PrintWriter(System.out);
		do {
			int n = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			Cleaner cl = new Cleaner(n, debug);
			for (int i = 0; i < n; i++) {
				cl.abbLog(i, scan.next(), scan.nextInt(), scan.nextInt());
			}
			cl.printAnser(x, y);
		} while (debug);

		scan.close();
		System.exit(0);
	}
}

class Cleaner {
	boolean debug;

	class Log {
		boolean fixed;
		char d;
		int ll;
		int lu;

		int l;
		int dw;

		public Log(char d, int ll, int lu) {
			this.d = d;
			this.ll = ll;
			this.lu = lu;
			if (d == 'L' || d == 'R')
				fixed = true;
			else {
				fixed = false;
				this.d = 'L';
			}
		}
	}

	class Move {
		int tuxrn;
		int xl, xu;
		int yl, yu;

		public Move(int xwl, int xwu, int ywl, int ywu) {
			this.xl = xwl;
			this.xu = xwu;
			this.yl = ywl;
			this.yu = ywu;
		}
	}

	Log[] log;

	public Cleaner(int n, boolean debug) {
		this.debug = debug;
		log = new Log[n];
	}

	public void printAnser(int x, int y) {
		int cnt = 0;
		for (int i = 0; i < log.length; i++)
			if (!log[i].fixed)
				cnt++;
		cnt++;
		Move[] mv = new Move[cnt];
		initLogDirection(mv);

		if (!fixLogDirection(mv, x, y)) {
			System.out.println("-1");
			return;
		}

		if (debug)
			for (int i = 0; i < log.length; i++)
				System.out.println("debug\tDirection=" + log[i].d);

		fixLength(x, y);

		for (int i = 0; i < log.length; i++)
			System.out.println(log[i].d + " " + log[i].l);
	}

	private void fixLength(int x, int y) {

		int dw = 0;
		for (int i = 0; i < log.length; i++) {
			if (log[i].d == 'L')
				dw = (dw + 1) % 4;
			else
				dw = (dw + 3) % 4;
			log[i].dw = dw;
		}

		int xw = 0, yw = 0;
		for (int i = 0; i < log.length; i++)
			switch (log[i].dw) {
			case 0:
				if (x > 0)
					log[i].l = log[i].lu;
				else
					log[i].l = log[i].ll;
				xw += log[i].l;
				break;
			case 1:
				if (y > 0)
					log[i].l = log[i].lu;
				else
					log[i].l = log[i].ll;
				yw += log[i].l;
				break;
			case 2:
				if (x > 0)
					log[i].l = log[i].ll;
				else
					log[i].l = log[i].lu;
				xw -= log[i].l;
				break;
			case 3:
				if (y > 0)
					log[i].l = log[i].ll;
				else
					log[i].l = log[i].lu;
				yw -= log[i].l;
				break;
			}

		if (debug)
			System.out.println("debug\tTotal phase-1 x=" + xw + "\ty=" + yw);

		xw = Math.abs(xw - x);
		yw = Math.abs(yw - y);
		int adj;

		for (int i = 0; i < log.length; i++)
			if (log[i].dw % 2 == 0) {
				if (xw > 0) {
					adj = Math.min(xw, Math.abs(log[i].lu - log[i].ll));
					xw -= adj;
					if (log[i].l == log[i].ll)
						log[i].l += adj;
					else
						log[i].l -= adj;
				}
			} else {
				if (yw > 0) {
					adj = Math.min(yw, Math.abs(log[i].lu - log[i].ll));
					yw -= adj;
					if (log[i].l == log[i].ll)
						log[i].l += adj;
					else
						log[i].l -= adj;
				}
			}

		if (debug)
			System.out.println("debug\tTotal phase-2 x=" + xw + "\ty=" + yw);

	}

	class DirectionPatt {
		int differ;
		long patt;

		public DirectionPatt(int df, long pt) {
			this.differ = df;
			this.patt = pt;
		}
	}

	public class compDir implements Comparator<DirectionPatt> {

		@Override
		public int compare(DirectionPatt o1, DirectionPatt o2) {
			if (o1.differ > o2.differ)
				return 1;
			else if (o1.differ == o2.differ)
				return 0;
			else
				return -1;
		}

	}

	private boolean fixLogDirection(Move[] mv, int x, int y) {
		// set pattern to long code
		// same with initial=1 not same=0 and first ? is set to bit 1, second ?
		// is set to bit 2
		// all ? is set to L in initial status
		//
		long patt = 0;
		for (int i = 1; i < mv.length; i++) {
			patt <<= 1;
			patt++;
		}

		PriorityQueue<DirectionPatt> pqDir = new PriorityQueue<DirectionPatt>(new compDir());
		HashSet<Long> hsDir = new HashSet<Long>();

		hsDir.add(patt);
		pqDir.add(new DirectionPatt(getDiffer(patt, mv, x, y), patt));
		patt = searchDirection(pqDir, hsDir, mv, x, y);
		if (debug)
			System.out.println("debug\tSelected pattern=" + patt);
		if (patt == -1)
			return false;

		int tmp = 0;
		for (int i = 0; i < log.length; i++)
			if (!log[i].fixed) {
				if ((tmp ^ (patt & 1)) == 0) {
					log[i].d = 'R';
					tmp ^= 1;
				}
				patt >>= 1;
			}
		return true;
	}

	private int getDiffer(long patt, Move[] mv, int x, int y) {
		// get possible range
		int xwl = mv[0].xl;
		int xwu = mv[0].xu;
		int ywl = mv[0].yl;
		int ywu = mv[0].yu;

		for (int i = 1; i < mv.length; i++, patt >>= 1)
			if ((patt & 1) != 0) {
				xwl += mv[i].xl;
				xwu += mv[i].xu;
				ywl += mv[i].yl;
				ywu += mv[i].yu;
			} else {
				xwl -= mv[i].xu;
				xwu -= mv[i].xl;
				ywl -= mv[i].yu;
				ywu -= mv[i].yl;
			}

		int r = 0;

		if (x < xwl)
			r += (xwl - x);
		else if (x > xwu)
			r += (x - xwu);

		if (y < ywl)
			r += (ywl - y);
		else if (y > ywu)
			r += (y - ywu);

		return r;
	}

	private long searchDirection(PriorityQueue<DirectionPatt> pqDir, HashSet<Long> hsDir, Move[] mv, int x, int y) {
		if (pqDir.isEmpty())
			return -1;
		DirectionPatt dp = pqDir.poll();
		if (dp.differ == 0)
			return dp.patt;

		if (debug)
			System.out.println("debug\tdiffer=" + dp.differ + "\tpattern=" + dp.patt);

		long mask = 1;
		for (int i = 1; i < mv.length; i++, mask <<= 1) {

			long newPatt = (dp.patt ^ mask);
			if (hsDir.contains(newPatt))
				continue;

			hsDir.add(newPatt);
			pqDir.add(new DirectionPatt(getDiffer(newPatt, mv, x, y), newPatt));
		}

		return searchDirection(pqDir, hsDir, mv, x, y);
	}

	private void initLogDirection(Move[] mv) {
		int xwl = 0, xwu = 0;
		int ywl = 0, ywu = 0;
		int dw = 0;
		int cnt = 0;
		for (int i = 0; i < log.length; i++) {
			if (!log[i].fixed) {
				mv[cnt++] = new Move(xwl, xwu, ywl, ywu);
				xwl = 0;
				xwu = 0;
				ywl = 0;
				ywu = 0;
			}
			if (log[i].d == 'L')
				dw = (dw + 1) % 4;
			else
				dw = (dw + 3) % 4;
			switch (dw) {
			case 0:
				xwl += log[i].ll;
				xwu += log[i].lu;
				break;
			case 1:
				ywl += log[i].ll;
				ywu += log[i].lu;
				break;
			case 2:
				xwl -= log[i].lu;
				xwu -= log[i].ll;
				break;
			case 3:
				ywl -= log[i].lu;
				ywu -= log[i].ll;
				break;
			}
		}

		mv[cnt++] = new Move(xwl, xwu, ywl, ywu);

		if (debug)
			for (int i = 0; i < mv.length; i++)
				System.out.println("debug\tturn=" + i + "\txl=" + mv[i].xl + "\txu=" + mv[i].xu + "\tyl=" + mv[i].yl
						+ "\tyu=" + mv[i].yu);
	}

	public void abbLog(int i, String d, int ll, int lu) {
		log[i] = new Log(d.charAt(0), ll, lu);
	}
}

class UserScanner {
	private InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public UserScanner(InputStream inStream) {
		in = inStream;
	}

	private void read() {
		ptr = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(9);
		}
	}

	private byte getByte() {
		if (ptr >= buflen)
			read();
		if (buflen < 0 || isCtlSpace(buffer[ptr])) {
			return -1;
		} else
			return buffer[ptr++];
	}

	private void skipCtlSpace() {
		for (; ptr < buflen; ptr++)
			if (!isCtlSpace(buffer[ptr]))
				return;
		read();
		skipCtlSpace();
	}

	private boolean isCtlSpace(byte b) {
		if (b <= ' ' || b > '~')
			return true;
		else
			return false;
	}

	public void close() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(9);
		}
	}

	public String next() {
		skipCtlSpace();
		StringBuilder sb = new StringBuilder();
		byte b;
		while ((b = getByte()) != -1) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public long nextLong() {
		skipCtlSpace();
		long n = 0;
		boolean minus = false;
		byte b;
		while ((b = getByte()) != -1) {
			if (b == '-')
				minus = true;
			else {
				n *= 10d;
				n += (long) (b - '0');
			}
		}
		if (minus)
			return n * -1;
		else
			return n;
	}

	public int nextInt() {
		skipCtlSpace();
		int n = 0;
		boolean minus = false;
		byte b;
		while ((b = getByte()) != -1) {
			if (b == '-')
				minus = true;
			else {
				n *= 10;
				n += (b - '0');
			}
		}
		if (minus)
			return n * -1;
		else
			return n;
	}
}