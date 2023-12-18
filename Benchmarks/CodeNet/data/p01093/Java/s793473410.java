import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(sc.next());
			if (n == 0) break;
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = Integer.parseInt(sc.next());
			Arrays.sort(a);
			int ans = Integer.MAX_VALUE;
			for (int i = 1; i < n; i++)
				ans = Math.min(ans, a[i] - a[i - 1]);
			System.out.println(ans);
		}
	}
}
