import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int x = scan.nextInt();
		int[] a = new int[m];
		int i = 0;
		for(i = 0; i < m; i++) {
			a[i] = scan.nextInt();
		}
		int cost_0 = 0;
		int cost_n = 0;
		int[] s = new int[n + 1];
		for(i = 0; i < n + 1; i++) {
			s[i] = 0;
		}
		for(i = 0; i < m; i++) {
			s[a[i]] = 1;
		}
		for(i = x; i != 0; i--) {
			cost_0 = cost_0 + s[i];
		}
		for(i = x; i != n; i++) {
			cost_n = cost_n + s[i];
		}
		if(cost_0 <= cost_n) {
			System.out.println(cost_0);
		} else {
			System.out.println(cost_n);
		}
	}
}