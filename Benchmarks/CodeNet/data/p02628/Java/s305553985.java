import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long[] input = new long[(int) N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextLong();
		}
		Arrays.sort(input);
		long sum = 0;
		for (int i = 0; i < K; i++) {
			sum += input[i];
		}
		System.out.println(sum);
	}
}