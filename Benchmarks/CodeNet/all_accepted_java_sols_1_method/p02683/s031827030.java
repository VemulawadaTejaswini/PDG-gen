import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int money = 100000000;
		int ans = -1;
		int[] C = new int[N];
		int[][] A = new int[N][M];
		for(int i = 0;i < N;i++){
			C[i] = sc.nextInt();
			for(int j = 0;j < M;j++){
				A[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i < (1 << N);i++){
			int valueSum = 0;
			boolean flg = true;
			int[] buf = new int[M];
			for(int j = 0;j < N;j++){
				if((1 & (i >> j)) == 1){
					valueSum += C[j];
					for(int k = 0;k < M;k++){
						buf[k] += A[j][k];
					}
				}
			}
			for(int j = 0;j < M;j++){
				if(buf[j] < X){
					flg = false;
				}
			}
			if(flg){
				money = Math.min(money,valueSum);
			}
		}
		if(money < 100000000){
			ans = money;
		}
		System.out.println(ans);
	}
}