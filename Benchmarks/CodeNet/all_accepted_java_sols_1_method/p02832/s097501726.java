import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		int res = 0;
		int seq = 1;
		for (int i = 0; i < N; i++) {
			if (input[i] == seq) {
				seq++;
			} else {
				res++;
			}
		}
		if (res == N) {
			System.out.print(-1);
		} else {
			System.out.print(res);
		}
	}
}