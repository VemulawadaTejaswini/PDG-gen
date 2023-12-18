import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int W = input.nextInt();

		int[] weights = new int[N];
		int[] values = new int[N];

		for(int i = 0; i < N; i++){
			weights[i] = input.nextInt();
			values[i] = input.nextInt();
		}

		long[][] memo = new long[N+1][W+1];

		for(int i = 1; i < N+1; i++){
			for(int j = 0; j <= W; j++){
				if(weights[i-1] <= j) memo[i][j] = Math.max(memo[i-1][j], memo[i-1][j-weights[i-1]] + values[i-1]);
				else memo[i][j] = memo[i-1][j];
			}
		}

		System.out.println(memo[N][W]);
	}
}