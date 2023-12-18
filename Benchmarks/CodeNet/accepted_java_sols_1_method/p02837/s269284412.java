//1時間
import java.util.Scanner;

public class Main {
//java11
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];
		int[][] x = new int[N][];
		int[][] y = new int[N][];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			x[i] = new int[A[i]];
			y[i] = new int[A[i]];
			for(int j=0; j<A[i]; j++) {
				x[i][j] = sc.nextInt();
				y[i][j] = sc.nextInt();
			}
		}

		int ans = 0;
		for(int i=0; i<(1 << N); i++) {
			int honest_n = 0;
			boolean check = true;
			Outside:
			for(int j=0; j<N; j++) {
				if((1 & (i >> j)) == 1) {
					//正直者
					for(int k=0; k<A[j]; k++) {
						if(y[j][k] != (1 & (i >> (x[j][k]-1) ))){
							check = false;
							break Outside;
						}
					}
					honest_n++;
				}

			}

			if(check)
				ans = Math.max(ans, honest_n);
		}

		System.out.println(ans);
	}

}
