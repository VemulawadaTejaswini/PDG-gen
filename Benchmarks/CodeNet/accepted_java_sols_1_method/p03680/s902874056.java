import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = Integer.parseInt(sc.next());
		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++)
			a[i] = Integer.parseInt(sc.next());
		int tem = a[1];
		int ans = 1;
		while (tem != 2) {
			tem = a[tem];
			ans++;
			if (ans > n) {
				ans = -1;
				break;
			}
		}
		System.out.println(ans);
	}
}