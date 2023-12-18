import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long target = sc.nextLong();
		long b = sc.nextLong();
		long r = sc.nextLong();
		long sum = r + b;

		if (b == 0 || target == 0) {
			System.out.println(0);
			return;
		}

		//B+RがNよりも小さい場合
		if (target <= sum) {
			if(b <= target) {
				System.out.println(b);
				return;
			}else{
				System.out.println(target);
				return;
			}
		}

		//B+RがNよりも大きい場合
		long count = target / sum;
		long temp = target - (count * sum);

		if (b <= temp) {
			System.out.println(count * b + b);
		} else {
			System.out.println(count * b + temp);
		}

	}
}
