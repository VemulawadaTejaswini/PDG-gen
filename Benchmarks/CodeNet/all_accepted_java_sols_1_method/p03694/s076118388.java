import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		int ans = 0;
		for (int i = a.length-1; i > 0; i--) {
			ans = ans + (a[i]-a[i-1]);
		}
		System.out.println(ans);
	}
}
