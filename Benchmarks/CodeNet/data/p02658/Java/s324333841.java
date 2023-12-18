import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long sum = 1;
		long a = (long) Math.pow(10, 18);
		long A;
		boolean zeroFlg = false;
		boolean overFlg = false;

		for (int i = 0; i < N; i++) {
			A = sc.nextLong();
			sum = sum * A;
			if (A == 0) {
				zeroFlg = true;
			} else if (sum > a) {
				overFlg = true;
			}
		}
		sc.close();

		if(zeroFlg) {
			System.out.println(0);
		}else if(overFlg) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
		}

	}

}
