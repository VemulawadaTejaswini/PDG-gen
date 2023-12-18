import java.util.*;
import java.io.*;

public class Main {

	static void solve (Scanner in, PrintWriter out, Methods ms) {

		while (true) {

			int h = in.nextInt(), w = in.nextInt();
			if (h == 0 && w == 0) return;

			//Input
			char[][] map = new char[h + 2][w + 2];
			for (int i = 0; i < h + 2; i++) {
				Arrays.fill(map[i], '-');
			}
			for (int i = 0; i < h; i++) {
				String temp = in.next();
				for (int j = 0; j < w; j++) {
					map[i + 1][j + 1] = temp.charAt(j);
				}
			}

			//Breadth First Search
			boolean[][] memo = new boolean[h + 2][w + 2];
			for (int i = 0; i < h + 2; i++) {
				Arrays.fill(memo[i], true);
			}
			for (int i = 1; i < h + 1; i++) {
				for (int j = 1; j < w + 1; j++) {
					memo[i][j] = false;
				}
			}
			
			
			int ans = 0;
			
			for (int i = 1; i < h + 1; i++) {
				for (int j = 1; j < w + 1; j++) {
					
					//探索開始
					if (memo[i][j] == false) {
						
						char fruit = map[i][j];
						ArrayDeque<Point> dq = new ArrayDeque<>();
						dq.addLast(new Point(j, i));
						memo[i][j] = true;
						while (dq.isEmpty() == false) {
							
							Point p = dq.removeFirst();
							for (int k = 0; k < 4; k++) {
								int x = p.x + dx[k];
								int y = p.y + dy[k];
								if (map[y][x] == fruit && memo[y][x] == false) {
									dq.addLast(new Point(x, y));
									memo[y][x] = true;
								}
							}
							
						}
						
						
						
						ans++;
						
					}
					
				}
			}
			
			out.println(ans);
			
		}

	}

	static class Point {
		int x, y;
		Point (int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};



	public static void printMap (char[][] a) {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Methods ms = new Methods();
		solve(in, out, ms);
		in.close();
		out.close();

	}

	static class Methods {

		public void print (Object... ar) {System.out.println(Arrays.deepToString(ar));}

		public int max (int... ar) {Arrays.sort(ar); return ar[ar.length-1];}

		public int min (int... ar) {Arrays.sort(ar); return ar[0];}

		public long gcd (long a, long b) {return b > 0 ? gcd(b,a%b) : a;}

		public long lcm (long a, long b) {return a / gcd(a,b) * b;}

		public long factorial (int i) {
			if (i == 1) return 1;
			else return i * factorial(i-1);
		}

		public int manhat (int x1, int y1, int x2, int y2) {
			return Math.abs(x1 - x2) + Math.abs(y1 - y2);
		}

		public double euclid (double x1, double y1, double x2, double y2) {
			return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		}

		public boolean isPrime (int n) {
			if (n == 2) return true;
			if (n < 2 || n % 2 == 0) return false;
			for (int i = 3; i <= Math.sqrt(n); i += 2) if(n % i == 0) return false;
			return true;
		}

	}

}
