import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long min = Long.MAX_VALUE;

		for (int i = 1; i <= Math.sqrt(N); i++) {
			if (N %i ==0) {
				long let = i + (N/i) - 2;
				if (min > let) {
					min = let;
				}
			}
		}
		System.out.println(min);
	}

}