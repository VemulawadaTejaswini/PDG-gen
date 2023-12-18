import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(sc.next());
		int ans = Integer.MAX_VALUE;
		for (int i = -100; i <= 100; i++) {
			int cost = 0;
			for (int j = 0; j < n; j++)
				cost += Math.pow(a[j] - i, 2);
			if (cost < ans)
				ans = cost;
		}
		System.out.println(ans);
	}
}