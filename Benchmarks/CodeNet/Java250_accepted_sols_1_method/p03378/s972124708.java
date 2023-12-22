import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int x = scan.nextInt();
		int[] a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = scan.nextInt();
		}
		int costl = 0;
		int costr = 0;
		for (int i = 1; i < x; i++) {
			for (int j = 0; j < m; j++) {
				if (i == a[j]) costl++;
			}
		}
		for (int i = x+1; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == a[j]) costr++;
			}
		}
		System.out.println(Math.min(costl, costr));
	}
}
