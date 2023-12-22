import java.util.Scanner;
import java.io.*;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			if (n == 0) break;
			int[] s;
			s = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i ++) {
				s[i] = scan.nextInt();
				sum += s[i];
			}
			double m = (double)sum / n;
			double shiguma = 0;
			for (int i = 0; i < n; i ++) shiguma += (s[i] - m) * (s[i] - m);
			double a = Math.sqrt(shiguma / n);
			System.out.printf("%f\n", a);
		}
	}
}