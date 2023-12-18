import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			max = Math.max(max, a);
			min = Math.min(min, a);
		}
		System.out.println(max - min);
	}
}
