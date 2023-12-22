import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int K;

	public static void main(String[] args) {
		N = sc.nextInt();
		K = sc.nextInt();

		char[] S = sc.next().toCharArray();
		if (S[K - 1] == 'A') {
			S[K - 1] = 'a';
		} else if (S[K - 1] == 'B') {
			S[K - 1] = 'b';
		} else if (S[K - 1] == 'C') {
			S[K - 1] = 'c';
		}

		System.out.println(S);
	}

}