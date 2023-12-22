import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		int[] p = new int[m];
		int[] x = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = scan.nextInt();
			x[i] = scan.nextInt();
		}
		int[] r = new int[m];
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				if (i == p[j]-1) {
					r[j] = r[j] + x[j];
				} else {					
					r[j] = r[j] + t[i];
				}
			}
		}
		for (int i = 0; i < m; i++) {
			System.out.println(r[i]);
		}
	}
}
