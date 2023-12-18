import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		long ans = 0;
		long end = 0;
		for (int i = 0; i < n; i++) {
			long next = a[i] + t;
			ans += Math.min(next - end, t);
			end = next;
		}
		System.out.println(ans);
	}
}
