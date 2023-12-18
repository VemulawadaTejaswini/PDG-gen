import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int oddCount = 0;
		for (int i = 1; i <= N; i++) {
			if (i % 2 != 0) {
				oddCount++;
			}
		}
		System.out.println(String.format("%.10f", (double) oddCount / (double) N));
	}
}