import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int Q = sc.nextInt();
			int[] win = new int[N];
			for (int i = 0; i < Q; i++) win[sc.nextInt() - 1]++;
			for (int i = 0; i < N; i++) System.out.println(K - Q + win[i] > 0 ? "Yes" : "No");
		}
	}
}