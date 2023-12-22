import java.util.Scanner;

public class Main {
 	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int N = scanner.nextInt();
 		int K = scanner.nextInt();
 		int Q = scanner.nextInt();
 		int Score[] = new int[N];
 		for (int i = 0; i < N; i++) {
 			Score[i] = 0;
 		}
 		for (int j = 0; j < Q; j++) {
 			int x = scanner.nextInt();
 			Score[x - 1] += 1;
 		}
 		for (int i = 0; i < N; i++) {
 			if (K - Q + Score[i] > 0) {
 				System.out.println ("Yes");
 			} else {
 				System.out.println ("No");
 			}
 		}
 	}
}