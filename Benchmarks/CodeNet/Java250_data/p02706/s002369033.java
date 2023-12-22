import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		for (int i = 0; i < K; i++) {

			N -= sc.nextInt();
		}
		if (N < 0) {
			System.out.println(-1);
		} else {
			System.out.println(N);
		}
	}
}