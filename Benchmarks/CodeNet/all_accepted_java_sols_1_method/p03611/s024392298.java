
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int[] b = new int[100010];
		for(int i = 0 ; i < n ; i++) {
			b[a[i]]++;
		}
		int ans = 0;
		for(int i = 1 ; i < 100009 ; i++) {
			ans = Math.max(ans, b[i - 1] + b[i] + b[i + 1]);
		}
		System.out.println(ans);
	}
}