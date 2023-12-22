import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n;
		long min = Long.MAX_VALUE;
		n = stdin.nextInt();
		long[] A = new long[n];
		A[0] = stdin.nextLong();
		for (int i = 1; i < n; i++) {
			//累積和の配列
			A[i] = A[i - 1] + stdin.nextInt();
		}
		if (n == 2) {
			//すぬけくんもアライさんも１枚の時
		min=Math.abs(A[1]-2*A[0]);
		} else {
			for (int i = 0; i < n - 1; i++) {
				if (Math.abs(A[n - 1] - 2 * A[i]) < min) {
					min = Math.abs(A[n - 1] - 2 * A[i]);
				}
			}
		}
		System.out.println(min);

	}

}
