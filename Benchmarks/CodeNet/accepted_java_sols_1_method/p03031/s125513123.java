import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[] K = new int[M];
		int[] P = new int[M];
		int[][] S = new int[M][];
		int answer = 0;
		for(int i = 0; i < M; i++) {
			K[i] = Integer.parseInt(sc.next());
			S[i] = new int[K[i]];
			for(int j = 0; j < K[i]; j++) {
				S[i][j] = Integer.parseInt(sc.next());
			}
		}
		for(int i = 0; i < M; i++) {
			P[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		//ビット全探索
		for(int i = 0; i < Math.pow(2, N); i++) {
			boolean check = true;
			for(int j = 0; j < M; j++) {
				int count = 0;
				//各スイッチが点灯しているかどうか確認
				for(int k = 0; k < K[j]; k++) {
					if((1 & i >> S[j][k]  - 1) == 1) count++;
				}
				//2で割った余りが一致するかどうか確認
				if(count % 2 != P[j]) {
					 check = false;
				}
			}
			if(check) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}