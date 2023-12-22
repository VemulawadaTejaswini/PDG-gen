import java.util.Scanner;

public class Main {

	static int INF = 1001001001;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int[] C = new int[N];
		int[][] a = new int[12][12];
		for(int i = 0;i < N;i++){
			C[i]= sc.nextInt();
			for(int j = 0;j < M;j++){
				a[i][j] = sc.nextInt();
			}
		}
		int ans = INF;
		//ビット演算子を用いて2^n通りを試す
		for(int s = 0;s < (1<<N);s++){
			int cost = 0;
			int[] d = new int[M];
			for(int i = 0;i < N;i++){
				if((s>>i&1)==1){
					cost += C[i];
					for(int j = 0;j < M;j++){
						d[j] += a[i][j];
					}
				}
			}
			boolean flag = true;
			for(int j = 0;j < M;j++){
				if(d[j] < X)flag = false;
			}
			if(flag)ans = Math.min(ans, cost);
		}
		if(ans == INF){
			System.out.println(-1);
		}else{
			System.out.println(ans);
		}
	}
}