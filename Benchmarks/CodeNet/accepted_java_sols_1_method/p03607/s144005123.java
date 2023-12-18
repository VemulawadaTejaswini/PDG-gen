import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[] a = new long[n];
		for (int i = 0 ; i < n; i++)
			a[i] = Long.parseLong(sc.next());
		Arrays.sort(a);
		int ans = 0;
		for (int i = 0; i < n;) {
			int index = i;
			while (i < n && a[index] == a[i])
				i++;
			if ((i - index) % 2 != 0)
				ans++;
		}
		System.out.println(ans);
	}
}