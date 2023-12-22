import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W[] = new int[N];
		int nowSum = 0;
		int allSum = 0;
		int minSum = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
			allSum += W[i];
		}

		for (int i = 0; i < N; i++) {
			nowSum += W[i];
			minSum = Math.min(minSum, Math.abs(nowSum - (allSum - nowSum)));
		}

		System.out.println(minSum);
	}
}
