import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long min = Long.MAX_VALUE;
		long N = sc.nextLong();
		for (int i = 0; i < 5; i++) {
			long tmp = sc.nextLong();
			if (tmp < min) {
				min = tmp;
			}
		}
		if (N % min == 0) {
			System.out.print(N / min + 4);
		} else {
			System.out.print(N / min + 5);
		}
	}
}