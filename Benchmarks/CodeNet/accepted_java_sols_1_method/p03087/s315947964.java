import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();

		int[] cnt = new int[n + 1];
		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C') {
				cnt[i + 1] = cnt[i] + 1;
			} else {
				cnt[i + 1] = cnt[i];
			}
		}

		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(cnt[r - 1] - cnt[l - 1]);
		}
		sc.close();

	}
}
