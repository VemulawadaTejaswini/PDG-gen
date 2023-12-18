import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long min = Long.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			min = Math.min(min, sc.nextLong());
		}
		sc.close();

		System.out.println((n + min - 1) / min + 4);
	}
}
