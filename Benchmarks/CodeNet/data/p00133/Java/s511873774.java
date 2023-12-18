import java.util.*;
import java.io.*;

public class Main {

	static void solve (Scanner in, PrintWriter out, Methods ms) {

		char[][] map = new char[8][8];
		for (int i = 0; i < 8; i++) {
			map[i] = in.next().toCharArray();
		}

		out.println(90);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				out.print(map[7-j][i]);
			}
			out.println();
		}

		out.println(180);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				out.print(map[7-i][7-j]);
			}
			out.println();
		}

		out.println(270);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				out.print(map[j][7-i]);
			}
			out.println();
		}

	}


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
