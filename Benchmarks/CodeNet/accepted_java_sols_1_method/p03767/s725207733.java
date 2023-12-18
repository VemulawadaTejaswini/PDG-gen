import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n * 3];
		
		Arrays.setAll(a, i -> sc.nextInt());
		Arrays.sort(a);
		
		long ans = 0;
		int idx = n * 3 - 2;
		for (int i = 0; i < n; i++) {
			ans += a[idx];
			idx -= 2;
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}
