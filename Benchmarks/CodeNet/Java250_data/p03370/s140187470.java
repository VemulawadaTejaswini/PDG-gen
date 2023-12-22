import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int sum = 0;
		int min = 0;
		for (int i = 0; i < N; i++) {
			int input = sc.nextInt();
			sum += input;
			if (i == 0)
				min = input;
			if (min > input)
				min = input;
		}
		int remaining = X - sum;
		System.out.println(remaining / min + N);
		sc.close();
	}
}