import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static final int MAX_N = 7;
	public static final int MAX_D = MAX_N * MAX_N;
	public static final int MAX_M = 2000;
	public static final int MAX_S = 3000;
	
	public static ArrayList<ArrayList<HashMap<Integer, Integer>>> memo = new ArrayList<ArrayList<HashMap<Integer,Integer>>>(MAX_D);
	
	//public static int[][][] memo = new int[MAX_D + 1][MAX_S + 1][MAX_M + 1];
	
	public static int DFS(int deep, int max_d, int S, int M, final int max_M){
		//System.out.println(deep + " " + max_d + " " + S + " " + M + " " + max_M);
		if(/*memo[deep][S][M] >= 0*/ memo.get(deep).get(S).containsKey(M)){
			//System.out.println(S + " " + M + " " + memo[deep][S][M]);
			return /*memo[deep][S][M]*/ memo.get(deep).get(S).get(M);
		} else if(deep == max_d){
			//System.out.println(S + " " + M);
			/*return memo[deep][S][M] = (S == 0 ? 1 : 0);*/ memo.get(deep).get(S).put(M, S == 0 ? 1 : 0);
			return S == 0 ? 1 : 0;
		}
		
		/* cut */
		final int diff = (max_d - deep);
		if(S < diff * M){
			//System.out.println(diff + " " + S + " " + M);
			memo.get(deep).get(S).put(M, 0);
			return 0;
			
			//return memo[deep][S][M] = 0;
		}
		
		int sum = 0;
		for(int next_M = M + 1; next_M <= max_M; next_M++){
			if(S < next_M){
				break;
			}
			
			sum += DFS(deep + 1, max_d, S - next_M, next_M, max_M);
			sum %= 100000;
		}
		
		//System.out.println(deep + " " + S + " " + M + " " + sum);
		
		memo.get(deep).get(S).put(M, sum);
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < MAX_D; i++){
			memo.add(new ArrayList<HashMap<Integer,Integer>>(MAX_S));
			
			for(int j = 0; j < MAX_S; j++){
				memo.get(i).add(new HashMap<Integer, Integer>());
			}
		}
		
		while (true) {
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			final int S = sc.nextInt();

			if (N == 0 && M == 0 && S == 0) {
				break;
			}
			
			/*
			for(int i = 0; i <= N * N; i++){
				for(int j = 0; j <= S; j++){
					memo.get(i).get(j).clear();
				}
			}
			*/
			
			System.out.println(DFS(0, N * N, S, 0, M));
		}
	}

}