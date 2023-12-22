import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int L = scanner.nextInt();
		int pie = 0;
		
		if (L >= 0) {
			//System.out.println("1こめ");
			pie = (1 + N) * N / 2 + (L - 1) * N - L;
		} else if (L + N - 1 < 0) {
			//System.out.println("2こめ");
			pie = N * (N - 1) / 2 + (L - 1) * (N - 1);
		} else {
			//System.out.println("3こめ");
			pie = (1 + N) * N / 2 + (L - 1) * N;
		}
		System.out.println(pie);
	}
}
