import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[m][n];
		int[] b = new int [m];
		int [] calc = new int[n];
		for(int i = 0;i < n;i++ ) {
			for(int j = 0;j < m;j++) {
				int c = sc.nextInt();
				a[j][i] = c;
			}
		}
		for(int i = 0;i < m;i++) {
			int c = sc.nextInt();
			b[i] = c;
		}
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				calc[i] = calc[i] + (a[j][i] * b[j]);
			}
			System.out.println(calc[i]);
		}
	}
}



