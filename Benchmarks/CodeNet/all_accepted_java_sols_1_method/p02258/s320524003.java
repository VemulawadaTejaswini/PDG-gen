import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}

		int min = a[0];
		int ans = -1001001001;
		for(int i = 1 ; i < n ; i++) {
			ans = Math.max(ans, a[i] - min);
			min = Math.min(min, a[i]);
		}
		System.out.println(ans);
	}
}