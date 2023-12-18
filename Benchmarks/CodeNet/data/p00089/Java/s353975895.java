import java.util.Scanner;

public class Main{
	static int N;
	
	public static void main(String[] args){
		int[][] square = getSquare();
		int[][] dp = new int[100][100];
		dp[0][0] = square[0][0];

		for(int i = 1; i< N; i++){
			dp[0][i] = dp[0][i-1] + square[0][i];
			dp[i][0] = dp[i-1][0] + square[i][0];
		}
		for(int i = 1; i < N; i++){
			for(int j = 1; j < N; j++){
				dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + square[i][j];
			}
		}

		System.out.println(dp[N-1][N-1]);
	}

	static int[][] getSquare(){
		int[][] square = new int[100][100];
		Scanner sn = new Scanner(System.in);
		int ni = -1, nj = 0, esLen = 0;
		while(sn.hasNext()){
			String[] es = sn.nextLine().split(",");
			if(es.length > esLen) ni++;
			else nj++;
			esLen = es.length;
			int i = ni, j = nj;
			for(int k = 0; k < es.length; k++){
				square[i][j] = Integer.parseInt(es[k]);
				i--; j++;
			}
	
		}
		N = ni+1;
		return square;
	}

}