import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int[] l = new int[n];
		for (int i = 0; i < n; i++)
			l[i] = Integer.parseInt(sc.next());
		Arrays.sort(l);
		int ans = 0;
		for (int i = 1; i <= k; i++)
			ans += l[n - i];
		System.out.println(ans);
	}
}