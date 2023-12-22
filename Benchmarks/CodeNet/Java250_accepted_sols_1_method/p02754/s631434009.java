import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long target = sc.nextLong();
		long b = sc.nextLong();
		long r = sc.nextLong();
		long sum = r + b;

		//B+RがNよりも大きい場合
		long count = target / sum;
		long answer = b * count;

		answer += Math.min(target%sum, b);

		System.out.println(answer);
	}
}
