import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int L = scan.nextInt();
		//math.abs()
		double avg = 0.5 * (2 * L + N - 1);
		int[] apples = new int[N + 1];
		int sum = (int) (0.5 * N * (2 * L + N - 1));
		int min = 10000;
		for (int i = 1; i <=N; i++) {
			apples[i] = L + i - 1;
			if (Math.abs(apples[i]) < Math.abs(min)) {
				min = apples[i];
			}
		}
		System.out.println(sum - min);
	}
}
