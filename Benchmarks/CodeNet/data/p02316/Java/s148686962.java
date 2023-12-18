import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[][] vw = new int[n][2];
		for(int i = 0; i < n; i++){
			vw[i][0] = sc.nextInt();
			vw[i][1] = sc.nextInt();
		}
		int[] DP = new int[w+1];
		for(int i = 1; i <= w; i++){
			DP[i] = DP[i-1];
			for(int j = 0; j < n; j++){
				if(i-vw[j][1] >= 0){
					DP[i] = Math.max(DP[i],DP[i-vw[j][1]]+vw[j][0]);
				}
			}
		}
		System.out.println(DP[w]);
	}
}

