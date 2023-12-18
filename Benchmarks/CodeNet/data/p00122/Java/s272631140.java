import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
 
public class Main {
	private	static			BufferedReader	br = null;
	private	static	final	int[]			SV = { -2, -2, -2, -1, 0, 1, 2, 2, 2,  -1, 0,  1  };
	private	static	final	int[]			SH = { -1, 0,  1,  2,  2, 2, 1, 0, -1, -2, -2, -2 };

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		int[]	start = null;

		while ((start = parseStart()) != null) {
			Next[]	next = parseNext();
			solve(start, next);
		}
	}

	public static void solve(int[] start, Next[] next) {
		Point	cp = new Point();
		Point	np = null;

		cp.add(String.format("%d %d", start[0], start[1]));

		for (int i = 0; i < next.length && cp.size() > 0; i++) {
			int	sz = cp.size();

			np = new Point();
			for (int j = 0; j < sz; j++) {
				String[]	sp = cp.get(j).split(" ");
				int[]		t1 = { Integer.parseInt(sp[0]), Integer.parseInt(sp[1]) };

				for (int k = 0; k < SV.length; k++) {
					int[]	t2 = { t1[0]+SH[k], t1[1]+SV[k] };
					if (next[i].contains(t2[0], t2[1])) {
						String	st = String.format("%d %d", t2[0], t2[1]);
						if (!np.contains(st)) {
							np.add(st);
						}
					}
				}
			}

			cp = np;
		}

		if (cp.size() > 0) {
			System.out.println("OK");
		} else {
			System.out.println("NA");
		}
	}

	private static Next[] parseNext() {
		Next[]	next  = null;
		int		cnt   = parseNum();

		if (cnt > 0) {
			String	stdin = null;

			next = new Next[cnt];
			if ((stdin = parseStdin()) != null) {
				String[]	lines = stdin.split(" ");

				for (int i = 0; i < cnt; i++) {
					int	x = Integer.parseInt(lines[i*2]);
					int	y = Integer.parseInt(lines[i*2+1]);
					next[i] = new Next(x, y);
				}
			}
		}

		return next;
	}

	private static int[] parseStart() {
		int[]	start = null;
		String	stdin = null;

		if ((stdin = parseStdin()) != null) {
			if (!stdin.equals("0 0")) {
				String[]	lines = stdin.split(" ");

				start    = new int[2]; 
				start[0] = Integer.parseInt(lines[0]);
				start[1] = Integer.parseInt(lines[1]);
			}
		}

		return start;
	}

	private static int parseNum() {
		int		num = 0;
		String	str = null;

		if ((str = parseStdin()) != null) {
			num = Integer.parseInt(str);
		}

		return num;
	}

	private static String parseStdin() {
		String  stdin = null;

		try {
			String  tmp = br.readLine();
			if (tmp != null) {
				if (!tmp.isEmpty()) stdin = tmp;
			}
		}
		catch (IOException e) {}

		return stdin;
	}
}

class Point extends Stack<String> {	
}

class Next {
	int	xs;
	int	xe;
	int	ys;
	int	ye;

	public Next(int x, int y) {
		xs = (x>0) ? x-1: x;
		xe = (x<9) ? x+1: x;
		ys = (y>0) ? y-1: y;
		ye = (y<9) ? y+1: y;
	}

	public boolean contains(int x, int y) {
		return (xs <= x && x <= xe && ys <= y && y <= ye);
	}
}