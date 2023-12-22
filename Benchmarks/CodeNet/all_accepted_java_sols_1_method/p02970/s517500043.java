import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int D = scanner.nextInt();
		while(1 > N || N > 20 || 1 > D || D > 20) {
			N = scanner.nextInt();
			D = scanner.nextInt();
		}

		int count = 1; // 必要な人の数
		int spot = D + 1; // 人のいる場所14

		while(spot + D + 1 <= N) {
			spot = spot + (2*D + 1);
			count++;
		}
		System.out.println(count);
		scanner.close();
	}
}
