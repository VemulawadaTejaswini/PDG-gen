import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] p = new int[n];
		for (int i = 0; i < p.length; i++) {
			p[i] = Integer.parseInt(sc.next());

		}
		int ans = 0;
		for (int i = 1; i < p.length - 1; i++) {
			if ((p[i] > p[i - 1] || p[i] > p[i + 1]) && (p[i] < p[i - 1] || p[i] < p[i + 1])) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}