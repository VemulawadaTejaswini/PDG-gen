import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = n;
		for (int i = 0; i < n - 1; i++) {
		    ans += (long)(i + 1) * (n - i);
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    long left = Math.min(a, b);
		    int right = Math.max(a, b);
		    ans -= (left + 1) * (n - right);
		}
		System.out.println(ans);
	}
}
