import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] t = new int[n];
		int i = 0;
		for(i = 0; i < n; i++) {
			t[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		int[] t2 = new int[n];
		int[] p = new int[m];
		int[] x = new int[m];
		int[] t_sum = new int[m];
		for(i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				t2[j] = t[j];
			}
			p[i] = scan.nextInt();
			x[i] = scan.nextInt();
			t2[p[i] - 1] = x[i];
			t_sum[i] = 0;
			for(int j = 0; j < n; j++) {
				t_sum[i] = t_sum[i] + t2[j];
			}
		}
		for(i = 0; i < m; i++) {
			System.out.println(t_sum[i]);
		}
	}
}