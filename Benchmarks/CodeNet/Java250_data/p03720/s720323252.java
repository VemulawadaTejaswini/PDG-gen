import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}
		int[] r = new int[n+10];
		Arrays.fill(r, 0);
		for (int i = 0; i < m; i++) {
			r[a[i]]++;
			r[b[i]]++;
		}
		for (int i = 1; i <= n; i++) {			
			System.out.println(r[i]);
		}
	}
}
