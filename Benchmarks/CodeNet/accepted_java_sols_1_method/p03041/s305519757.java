import java.util.Scanner;

public class Main {
	static int N;
	static int K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		String S = sc.next();
		String[] s = S.split("");
		s[K-1] = s[K-1].toLowerCase();

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}

	}
}