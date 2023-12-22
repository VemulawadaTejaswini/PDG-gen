import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long sum = 0;
		for (int i = 0; i < N; i++) {
			if ((i + 1) % 3 != 0 && (i + 1) % 5 != 0) {
				sum += (i + 1);
			}
		}

		System.out.println(sum);
	}
}
