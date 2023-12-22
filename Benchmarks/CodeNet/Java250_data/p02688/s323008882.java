
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		boolean[] res = new boolean[N];
		for (int i = 0; i < K; i++) {
			int d = sc.nextInt();
			for (int j = 0; j < d; j++) {
				int tmp = sc.nextInt();
				res[tmp - 1] = true;
			}

		}
		int output = 0;
		for (int i = 0; i < res.length; i++) {
			if (!res[i]) {
				output++;
			}
		}
		System.out.println(output);
	}
}