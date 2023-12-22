import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
			sum += input[i];
		}
		double average = sum / (double) N;
		int pos = (int) Math.round(average);
		long res = 0;
		for (int i : input) {
			res += Math.pow(pos - i, 2);
		}
		System.out.println(res);
	}
}
