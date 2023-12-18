import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int[] C = new int[N];
		int[][] A = new int[N][M];
		int cost = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			C[i] = Integer.parseInt(sc.next());
			for(int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(sc.next());
			}
		}
		sc.close();

		//ビット全探索
		//各参考書が2進数の各桁に一致
		for(int i = 0; i < (1 << N); i++) {
			int tmpCost = 0;
			int[] satisfaction = new int[M];
			for(int j = 0; j < N; j++) {
				//各参考書を買うか買わないかで条件分岐
				if((i >> j & 1) == 1) {
					tmpCost += C[j];
					for(int k = 0; k < M; k++) {
						satisfaction[k] += A[j][k];
					}
				}
			}
			boolean check = true;
			//各アルゴリズムの理解度の確認
			for(int j = 0; j < M; j++) {
				if(satisfaction[j] < X) {
					check = false;
				}
			}

			//コストの比較
			if(check) {
				cost = Math.min(cost, tmpCost);
			}
		}
		//答えを出力
		System.out.println(cost != Integer.MAX_VALUE ? cost : -1);
	}
}