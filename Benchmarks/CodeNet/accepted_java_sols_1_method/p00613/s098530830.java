import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int K = sc.nextInt();
			if (K == 0) break;
			int sum = 0;
			for (int i = 0; i < K * (K - 1) / 2; ++i) {
				sum += sc.nextInt();
			}
			System.out.println(sum / (K - 1));
		}
	}
}