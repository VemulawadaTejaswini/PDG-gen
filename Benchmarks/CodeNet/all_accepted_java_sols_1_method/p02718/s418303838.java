import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] votes = new int[N];
		for (int i = 0; i < N; i++) {
			votes[i] = sc.nextInt();
		}
		
		Arrays.sort(votes);
		
		int totalScores = 0;
		for (int i = 0; i < N; i++) {
			totalScores += votes[i];
		}
		
		for (int i = 0; i < M; i++) {
			if (votes[N - (i + 1)] * 4 * M < totalScores) {
				System.out.println("No");
				return;			
			}
		}
		
		System.out.println("Yes");

	}
}