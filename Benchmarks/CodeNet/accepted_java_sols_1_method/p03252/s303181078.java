import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		sc.close();

		int cnt = 0;
		int[] ss = new int[26];
		int[] tt = new int[26];
		for (int i = 0; i < s.length; i++) {
			int si = s[i] - 'a';
			int sj = ss[si];
			int ti = t[i] - 'a';
			int tj = tt[ti];
			if (sj != tj) {
				System.out.println("No");
				return;
			}
			if (sj == 0) {
				cnt++;
				ss[si] = cnt;
				tt[ti] = cnt;
			}
		}
		System.out.println("Yes");
	}
}
