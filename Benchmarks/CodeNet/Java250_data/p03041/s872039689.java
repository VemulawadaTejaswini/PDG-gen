import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		String S = scanner.next();
		String str = S;
		String[] S1 = str.split("");
		
		String S2 = S1[K - 1].toLowerCase();
		
		for (int i = 0; i < K - 1; i++) {
			System.out.print(S1[i]);
		}
		
		System.out.print(S2);
		
		for (int j = K; j < N; j++) {
			System.out.print(S1[j]);
		}
	}
}