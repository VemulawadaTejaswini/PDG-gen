import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[][] A = new Integer[N][2];
		for (int i = 0; i < A.length; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = i;
		}
		Arrays.sort(A, (x, y) -> {
			if (x[0].compareTo(y[0]) > 0) {
				return 1;
			} else if (x[0].compareTo(y[0]) < 0) {
				return -1;
			} else {
				return 0;
			}
		});
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < A.length; i++) {
			if (i != A[A.length - 1][1]) {
				sb.append(A[A.length - 1][0]);
			} else {
				sb.append(A[A.length - 2][0]);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		sc.close();
	}
}