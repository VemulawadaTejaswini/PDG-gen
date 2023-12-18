import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long sum = 1;
		long[] input = new long[(int) N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextLong();
			if (input[i] == 0) {
				System.out.println(0);
				System.exit(0);
			}
		}
		for (int i = 0; i < N; i++) {
			sum *= input[i];
			if (sum > (long) Math.pow(10, 18)) {
				System.out.println(-1);
				System.exit(0);
			}
		}
		System.out.println(sum);
	}

}
