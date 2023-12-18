import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int ans[][] = new int[N][N];

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
			ans[i][j] = 0;
			}
		}

		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			int k = sc.nextInt();

			for(int j = 0; j < k; j++) {
				int switch_num = sc.nextInt();
				ans[i][switch_num-1] = 1;
			}
		}
		//答えの出力
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
			System.out.print(ans[i][j]);
				if (j != N-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
