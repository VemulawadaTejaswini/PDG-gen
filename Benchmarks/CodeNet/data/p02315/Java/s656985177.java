import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().mainrun();
	}

	Scanner scan;
	int N,W;
	List<Integer>v,w;

	private void mainrun() {

		scan = new Scanner(System.in);

		N = scan.nextInt();
		W = scan.nextInt();

		v = new ArrayList<Integer>();
		w = new ArrayList<Integer>();

		for(int i = 0;i < N ;i++){
			v.add(scan.nextInt());
			w.add(scan.nextInt());
		}

		int[][] dp = new int[N + 1][W + 1];
		Arrays.fill(dp[0], 0);

		for(int i = 0;i < N;i++) {
			for(int j = 0; j <= W;j++) {
				if(j >= w.get(i)) {
					dp[i + 1][j] = Math.max(dp[i][j - w.get(i)] + v.get(i),dp[i][j]);
				}else {
					dp[i + 1][j] = dp[i][j];
				}
			}
		}


		System.out.println(dp[N][W]);

		scan.close();
	}
}
