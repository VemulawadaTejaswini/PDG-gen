import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.IntStream;

public class Main {
	public static int h;
	public static int w;
	public static int k;
	public static String[] c;
	public static BigInteger res[][];
	public static Deque<StackElement> stack = new ArrayDeque<>();

	static class StackElement {
		int x;
		int y;
		int mukiid;
		BigInteger count;

		public StackElement(int xin, int yin, BigInteger countin,int mukiidin) {
			x = xin;
			y = yin;
			count = countin;
			mukiid = mukiidin;
		}

		public String toString() {
			return "(" + x + " " + y + " " + count + ")";
		}
	}

	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		k = sc.nextInt();

		var x1 = sc.nextInt() - 1;
		var y1 = sc.nextInt() - 1;
		var x2 = sc.nextInt() - 1;
		var y2 = sc.nextInt() - 1;
		c = new String[h];
		IntStream.range(0, h).forEach(i -> {
			c[i] = sc.next();
		});
		res = new BigInteger[h][];
		IntStream.range(0, h).forEach(i -> {
			res[i] = new BigInteger[w];
		});
		stack.push(new StackElement(x1, y1, BigInteger.ZERO,-1));
		while (!stack.isEmpty()) {
			StackElement e = stack.pollFirst();
			search(e.x, e.y, e.count,e.mukiid);
		}
		if (res[x2][y2] != null) {
			System.out.println(res[x2][y2]);
		} else {
			System.out.println(-1);
		}
	}

	public static boolean isHasu(int x, int y) {
		if (x < 0 || x >= h || y < 0 || y >= w) {
			return true;
		} else {
			return c[x].charAt(y) == '@';
		}
	}

	public static boolean isSeachable(int x, int y, BigInteger count) {
		if ((!isHasu(x, y)) && (res[x][y] == null )) {
			return true;
		} else {
			return false;
		}
	}

	public static void search(int x, int y, BigInteger count,int mukiid) {
		if (isSeachable(x, y, count)) {
			res[x][y] = count;
			BigInteger nextCount = count.add(BigInteger.ONE);
			if(mukiid!=2) {
				for (int i = x + 1; i <= x + k; i++) {
					if (!isSeachable(i, y, nextCount)) {
						break;
					}
					stack.push(new StackElement(i, y, nextCount,1));
				}
			}
			if(mukiid!=1) {
				for (int i = x - 1; i >= x - k; i--) {
					if (!isSeachable(i, y, nextCount)) {
						break;
					}
					stack.push(new StackElement(i, y, nextCount,2));
				}
			}
			if(mukiid!=4) {
				for (int i = y + 1; i <= y + k; i++) {
					if (!isSeachable(x, i, nextCount)) {
						break;
					}
					stack.push(new StackElement(x, i, nextCount,3));
				}
			}
			if(mukiid!=3) {
				for (int i = y - 1; i >= y - k; i--) {
					if (!isSeachable(x, i, nextCount)) {
						break;
					}
					stack.push(new StackElement(x, i, nextCount,4));
				}
			}
		}
	}
}