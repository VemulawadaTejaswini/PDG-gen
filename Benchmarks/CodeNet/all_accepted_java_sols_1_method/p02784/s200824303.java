import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		long sum = 0;
		for (int i = 0; i < N; i++) {
			sum += sc.nextInt();
		}
		if (sum >= H) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
}