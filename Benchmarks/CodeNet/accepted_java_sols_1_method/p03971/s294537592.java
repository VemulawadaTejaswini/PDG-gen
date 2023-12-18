import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		char[] S = sc.next().toCharArray();
		int a = 0;
		int b = 0;
		for (int i = 0; i < N; ++i) {
			boolean ok;
			if (S[i] == 'a') {
				ok = a + b < A + B;
				if (ok) ++a;
			} else if (S[i] == 'b') {
				ok = a + b < A + B && b < B;
				if (ok) ++b;
			} else {
				ok = false;
			}
			sb.append((ok ? "Yes" : "No") + "\n");
		}
		System.out.print(sb);
	}
}
