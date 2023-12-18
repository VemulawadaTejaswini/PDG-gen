import java.util.*;
import java.io.*;

public class Main {

	static void solve (Scanner in, PrintWriter out, Methods ms) {

		while (true) {
			
			int n = in.nextInt();
			if (n == 0) return;
			
			double minDif = Double.MAX_VALUE;
			int minId = -1;
			
			for (int i = 0; i < n; i++) {
				int id = in.nextInt();
				double height = in.nextDouble() / 100;
				double weight = in.nextDouble();
				double bmi = weight / (height * height);
				double dif = Math.abs(bmi - 22);
				if (dif < minDif) {
					minDif = dif;
					minId = id;
				}
			}
			
			out.println(minId);
			
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
