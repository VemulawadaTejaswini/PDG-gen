import java.util.Scanner;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {


		int N,tmp,maximum = -BIG_NUM,minimum = BIG_NUM;
		Scanner scanner = new Scanner(System.in);

		N = scanner.nextInt();

		for(int loop = 0; loop < N; loop++){
			tmp = scanner.nextInt();
			maximum = Math.max(maximum, tmp-minimum);
			minimum = Math.min(minimum, tmp);
		}

		System.out.println(maximum);
	}
}

