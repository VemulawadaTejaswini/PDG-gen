import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long result[] = new long[N];
		City[] c = new City[N];
		Main main = new Main();
		for (int i=0;i<N;i++) {
			result[i] = Long.MAX_VALUE;
			City temp = main.new City();
			temp.x = sc.nextInt();
			temp.y = sc.nextInt();
			temp.p = sc.nextLong();
			c[i] = temp;
		}
		int pattern =1;
		for (int i=0;i<N;i++) {
			pattern*=3;
		}
		for (int i=0;i<pattern-1;i++) {
			int road = Main.roadCount(i);
			if (road>=N) {
				continue;
			}
			int p[] = Main.changePattern(i, N);
			long cost = Main.cost(c, p);
			if (result[road]>cost) {
				result[road] = cost;
			}
		}
		for (int i=0;i<N;i++) {
			System.out.println(result[i]);
		}
		System.out.println(0);
	}

	public static int roadCount(int pattern) {
		int i=0;
		while (pattern>0) {
			if (pattern %3!=0) {
				i++;
			}
			pattern /=3;
		}
		return i;
	}

	public static int[] changePattern(int pattern,int N) {
		int p[] = new int[N];
		int i = 0;
		while (pattern>0) {
			p[i]=pattern%3;
			i++;
			pattern /=3;
		}
		return p;
	}
	public static long cost(City[] c,int[] pattern) {
		long result=0;
		TreeSet<Integer> xSet = new TreeSet<Integer>();
		xSet.add(0);
		TreeSet<Integer> ySet = new TreeSet<Integer>();
		ySet.add(0);
		for (int i=0;i<c.length;i++) {
			if (pattern[i]==1) {
				// x road
				xSet.add(c[i].x);
			} else if (pattern[i]==2) {
				// y road
				ySet.add(c[i].y);
			}
		}
		for (int i=0;i<c.length;i++) {
			if (pattern[i]==0) {
				long min = Long.MAX_VALUE;
				long x,y;
				try {
					x = xSet.ceiling(c[i].x);
					if (min>Math.abs(x-c[i].x)) {
						min = Math.abs(x-c[i].x);
					}
				} catch(Exception e ) {

				}
				try {
					x = xSet.floor(c[i].x);
					if (min>Math.abs(x-c[i].x)) {
						min = Math.abs(x-c[i].x);
					}
				}catch(Exception e ) {


				}
				try {
					y = ySet.ceiling(c[i].y);
					if (min>Math.abs(y-c[i].y)) {
						min = Math.abs(y-c[i].y);
					}
				}catch(Exception e ) {


				}
				try {
					y = ySet.floor(c[i].y);
					if (min>Math.abs(y-c[i].y)) {
						min = Math.abs(y-c[i].y);
					}
				}catch(Exception e ) {


				}

				result +=min * c[i].p;
			}
		}
		return result;
	}

	public class City  {
		int x;
		int y;
		long p;
	}
}