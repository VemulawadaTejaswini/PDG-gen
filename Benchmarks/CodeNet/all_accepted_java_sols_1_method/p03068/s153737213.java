import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int K = sc.nextInt();
		String a = S.substring(K-1, K);

		String ans = "";
		for (int i = 1; i <= N; i++) {
			String add = S.substring(i-1,i);
			if (!a.equals(add)) {
				ans += "*";
			} else {
				ans += add;
			}
		}

		System.out.println(ans);
	}
}
