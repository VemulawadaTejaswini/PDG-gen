import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] T = new int[N];
		for (int i = 0; i < N; i++) {
			T[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int[][] PX = new int[M][2];
		for (int i = 0; i < M; i++) {
			PX[i][0] = sc.nextInt();
			PX[i][1] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			int index = PX[i][0] - 1;
			int time = PX[i][1];
			int total = 0;
			for (int j = 0; j < N; j++) {
				if (j == index) {
					total += time;
				} else {
					total += T[j];
				}
			}
			System.out.println(total);
		}
	}
}