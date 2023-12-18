import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int t = sc.nextInt();
			if(t == 0 )break;
			else calc(t);
			
		}
	}
	public void calc(int t){
		int[] cycle = new int[t];
		for(int i = 0; i < t; i++){
			cycle[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		int[] inteview = new int[101];
		Arrays.fill(inteview, Integer.MAX_VALUE);
		for(int i = 0; i < n;i++){
			int d = sc.nextInt();
			int m = sc.nextInt();
			inteview[d] = m;
		}
		
		int[][] memo = new int[101][t];
		for(int i = 0; i < 101; i++){
			for(int j = 0; j < t; j++){
				memo[i][j] = Integer.MAX_VALUE;
			}
		}
		memo[1][0] = 0;
		for(int i = 1; i < t; i++){
			memo[1][i] = -1;
		}
		for(int d = 2; d < 101; d++){
			if(inteview[d] >= cycle[0] && memo[d-1][t-1] != -1){
				memo[d][0] = memo[d-1][t-1];
			}
			for(int c = 1; c < t; c++){
				if(memo[d-1][c-1] == -1){
					memo[d][c] = -1;
				}
				else{
					if(inteview[d] >= cycle[c])
						memo[d][c] = memo[d-1][c-1];
					else memo[d][c] = -1;
					if(memo[d][0] > memo[d-1][c-1] + 1){
						memo[d][0] = memo[d-1][c-1] + 1;
					}
				}
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < t; i++){
			if(memo[100][i] < ans) ans = memo[100][i];
		}
		System.out.println(ans);
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}