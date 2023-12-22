//1時間
import java.util.Scanner;

public class Main {
//java11
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] k = new int[M];
		int[][] s = new int[M][];
		int[] p = new int[M];

		for(int i=0; i<M; i++) {
			k[i] = sc.nextInt();

			s[i] = new int[k[i]];
			for(int j=0; j<k[i]; j++) {
				s[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<M; i++) {
			p[i] = sc.nextInt();
		}

		int ans = 0;
		for(int i=0; i<(1 << N); i++) {
			boolean allTrunOn = true;
			for(int index=0; index<M; index++) {
				int sum = 0;
				for(int j: s[index]) {
					if((1 & (i >> (j-1))) == 1) {
						sum++;
					}
				}

				if(sum % 2 != p[index]) {
					allTrunOn = false;
					break;
				}

			}

			//すべて点灯
			if(allTrunOn)
				ans++;
		}

		System.out.println(ans);
	}

}
