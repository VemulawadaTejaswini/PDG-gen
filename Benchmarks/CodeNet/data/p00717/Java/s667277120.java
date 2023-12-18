import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			Line[] l = new Line[n+1];
			for(int i=0;i<=n;i++) {
				int m = sc.nextInt();
				int[] x = new int[m];
				int[] y = new int[m];
				for(int j=0;j<m;j++) {
					x[j] = sc.nextInt();
					y[j] = sc.nextInt();
				}
				l[i] = new Line(m,x,y);
			}
			for(int i=1;i<=n;i++) {
				if (l[0].equals(l[i])) {
					System.out.println(i);
				}
			}
			System.out.println("+++++");

		}
	}

	public static class Line {
		int n;
		int[] length;
		int[] turn;
		public Line(int m,int[] x,int[] y) {
			n = m - 1;
			length = new int[n];
			turn = new int[n-1];
			length[0] = dist(x[0],y[0],x[1],y[1]);
			int bdir = -1;
			for(int i=0;i<n;i++) {
				length[i] = dist(x[i],y[i],x[i+1],y[i+1]);
				int dir = dir(x[i],y[i],x[i+1],y[i+1]);
				if (bdir >= 0) {
					turn[i-1] = (dir - bdir + 4) % 4 == 1 ? 1 : -1;
				}
				bdir = dir;
			}
		}
		private Line() {

		}
		private Line reverse() {
			Line l = new Line();
			l.n = n;
			l.length = new int[n];
			l.turn = new int[n-1];
			for(int i=0;i<n;i++) {
				l.length[i] = length[n-1-i];
			}
			for(int i=0;i<n-1;i++) {
				l.turn[i] = - turn[n-2-i];
			}
			return l;
		}
		public boolean equals(Line l) {
			if (Arrays.equals(length, l.length) && Arrays.equals(turn, l.turn)) {
				return true;
			}
			l = l.reverse();
			if (Arrays.equals(length, l.length) && Arrays.equals(turn, l.turn)) {
				return true;
			}
			return false;
		}
	}

	public static int dir(int x1,int y1,int x2,int y2) {
		if (x2 > x1) {
			return 0;
		}
		if (y2 > y1) {
			return 1;
		}
		if (x2 < x1) {
			return 2;
		}
		return 3;
	}
	public static int dist(int x1,int y1,int x2,int y2) {
		return Math.max(Math.abs(x1-x2),Math.abs(y1-y2));
	}

}