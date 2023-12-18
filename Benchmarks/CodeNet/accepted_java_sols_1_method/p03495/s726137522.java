import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int a[] = new int[n];
		int c[] = new int[n];
		int index = 0;
		for (int i = 0; i < n; i++)
			c[i] = 1;
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(sc.next());
		Arrays.sort(a);
		for (int i = 1; i < n; i++) {
			if (a[i] == a[i - 1])
				c[index]++;
			else
				index++;
		}
		Arrays.sort(c, 0, ++index);
		int ans = 0;
		for (int i = 0; i < index - k; i++) {
			ans += c[i];
		}
		System.out.println(ans);
	}
}