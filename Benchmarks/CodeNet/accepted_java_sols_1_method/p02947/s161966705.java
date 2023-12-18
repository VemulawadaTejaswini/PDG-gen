import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			char[] arr = sc.next().toCharArray();
			Arrays.parallelSort(arr);
			s[i] = String.valueOf(arr);
		}
		sc.close();
		Arrays.parallelSort(s);

		long ans = 0;
		long cnt = 1;
		for (int i = 1; i < n; i++) {
			if (s[i].equals(s[i - 1])) {
				cnt++;
			} else {
				ans += cnt * (cnt - 1) / 2;
				cnt = 1;
			}
		}
		ans += cnt * (cnt - 1) / 2;
		System.out.println(ans);
	}
}
