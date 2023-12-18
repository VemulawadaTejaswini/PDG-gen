import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long[] a = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = scan.nextLong();
		}
		boolean isOver = false;
		long result = 1;
		for (int i = 0; i < a.length; i++) {
			if (result > 1000000000000000000L) {
				isOver = true;
				break;
			} else {
				result = result * a[i];
			}
		}
		if (result > 1000000000000000000L) {
			isOver = true;
		}
		if (isOver) {
			System.out.println(-1);
		} else {
			System.out.println(result);
		}
	}

}
