import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner(System.in);
		PrintWriter pwriter = new PrintWriter(System.out);

		int n = scan.nextInt();
		long d = scan.nextLong();
		Treasure tr = new Treasure(n, d, debug);
		for (int i = 0; i < n; i++)
			tr.setTreasure(i, scan.nextLong(), scan.nextLong());
		pwriter.println(tr.getMaxValue());

		pwriter.flush();
		scan.close();
		System.exit(0);
	}
}

class Treasure {
	boolean debug;
	long differ;

	class Tr {
		long price;
		long value;

		public Tr(long p, long v) {
			price = p;
			value = v;
		}
	}

	Tr[] tr;

	public Treasure(int n, long d, boolean debug) {
		this.debug = debug;
		differ = d;
		tr = new Tr[n];
	}

	class Half {
		long price;
		long value;

		public Half(long p, long v) {
			price = p;
			value = v;
		}
	}

	ArrayList<Half> t1 = new ArrayList<Half>();
	ArrayList<Half> t2 = new ArrayList<Half>();

	public long getMaxValue() {
		int n = tr.length / 2;
		setHalfTable(t1, 0, n, 0l, 0l);
		setHalfTable(t2, n, tr.length - n, 0l, 0l);
		// Collections.sort(t1, new CompHalf());
		Collections.sort(t2, new CompHalf());
		if (debug)
			for (int i = 0; i < t1.size(); i++)
				System.out.println("t2 p=" + t2.get(i).price + ", v=" + t2.get(i).value);

		return getMaxPair(t1, t2, differ);
	}

	private long getMaxPair(ArrayList<Half> t1, ArrayList<Half> t2, long differ) {
		long ans = 0;
		for (int i = 0; i < t1.size(); i++) {
			long x = t1.get(i).value + getMaxPartner(t1.get(i).price, t2, differ);
			if (debug)
				System.out.println(" after search t2=" + x);
			if (x > ans)
				ans = x;
		}
		return ans;
	}

	private long getMaxPartner(long price, ArrayList<Half> tb, long differ) {
		int f = 0, t = tb.size() - 1, m = 0;
		while (f <= t) {
			m = f + (t - f) / 2;
			long dif = price + tb.get(m).price;
			if (Math.abs(dif) <= differ)
				break;
			if (dif > 0)
				t = m - 1;
			else
				f = m + 1;
		}

		long ans = Long.MIN_VALUE / 2;
		for (int i = m; i > 0; i--)
			if (Math.abs(price + tb.get(i).price) > differ)
				break;
			else if (tb.get(i).value > ans)
				ans = tb.get(i).value;
		for (int i = m + 1; i < tb.size(); i++)
			if (Math.abs(price + tb.get(i).price) > differ)
				break;
			else if (tb.get(i).value > ans)
				ans = tb.get(i).value;
		return ans;
	}

	private void setHalfTable(ArrayList<Half> tb, int pt, int len, long p, long v) {
		if (len > 0) {
			setHalfTable(tb, pt + 1, len - 1, p, v);
			setHalfTable(tb, pt + 1, len - 1, p + tr[pt].price, v + tr[pt].value);
			setHalfTable(tb, pt + 1, len - 1, p - tr[pt].price, v - tr[pt].value);
		} else
			tb.add(new Half(p, v));
	}

	public class CompHalf implements Comparator<Half> {
		@Override
		public int compare(Half o1, Half o2) {
			if (o1.price > o2.price)
				return 1;
			else if (o1.price == o2.price)
				return 0;
			else
				return -1;
		}
	}

	public void setTreasure(int i, long p, long v) {
		tr[i] = new Tr(p, v);
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