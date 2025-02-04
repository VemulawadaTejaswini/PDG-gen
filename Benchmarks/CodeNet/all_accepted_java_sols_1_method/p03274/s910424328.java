import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		int distance = 0;
		int right = 0;
		int left = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		
		for (int i = 0; i + K -1 < N; i++) {
			left = x[i];
			right = x[i + K - 1];
			if (Math.abs(right) > Math.abs(left)) {
				distance = Math.abs(right - left) + Math.abs(left);
			} else {
				distance = Math.abs(right - left) + Math.abs(right);
			}
			if (min > distance) {
				min = distance;
			}
		}
		
		//出力
		System.out.println(min);

		sc.close();
	}

}