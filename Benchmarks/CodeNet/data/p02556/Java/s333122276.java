import java.io.PrintStream;
import java.util.Scanner;
 
public class Main {
	static PrintStream o = System.out;
	static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		int n = sc.nextInt();
		Long[] x = new Long[n];
		Long[] y = new Long[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
		}
		long result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				long res = Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]);
				if (res > result) {
					result = res;
				}
			}
		}
		o.println(result);
	}
}