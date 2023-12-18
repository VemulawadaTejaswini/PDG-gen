import java.util.Scanner;

//AtCoder Beginner Contest 148
//B	Strings with the Same Length
public class Main {

	static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		String T = sc.next();
		sc.close();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(S.charAt(i));
			sb.append(T.charAt(i));
		}
		System.out.println(sb.toString());
	}
}
