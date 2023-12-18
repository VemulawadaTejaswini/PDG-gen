import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		char[] S = sc.next().toCharArray();
		sc.close();
		S[K - 1] = (char)(S[K - 1] + 32);
		for(int i = 0; i < N; i++) {
			System.out.print(S[i]);
		}
	}
}