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
	
	public static int DFS(final int rest_D, final int upper_bound_M, final int rest_S){
		//System.out.println(rest_D + " " + upper_bound_M + " " + rest_S);
		final int minimal_S = (rest_D * (rest_D + 1)) / 2;
		final int minimal_rest_S = minimal_S - rest_D;
		
		final int new_bound_M = Math.min(upper_bound_M, rest_S - minimal_rest_S);
		//System.out.println(rest_D + " " + new_bound_M + " " + rest_S);
		
		if(memo.get(rest_D).get(new_bound_M).containsKey(rest_S)){
			return memo.get(rest_D).get(new_bound_M).get(rest_S);
		}else if(rest_D == 0){
			final int ret = rest_S == 0 ? 1 : 0;
			memo.get(rest_D).get(new_bound_M).put(rest_S, ret);
			return ret;
		}else if(minimal_S >= rest_S){
			final int ret = minimal_S == rest_S ? 1 : 0;
			memo.get(rest_D).get(new_bound_M).put(rest_S, ret);
			return ret;
		}
		
		System.out.println("hi");
		
		int sum = 0;
		for(int cur_M = new_bound_M; cur_M >= rest_D; cur_M--){
			final int need_S = minimal_rest_S + cur_M;
			final int over_S = (cur_M * (cur_M + 1)) / 2 - ((cur_M - rest_D) * (cur_M - rest_D + 1)) / 2;
			
			//System.out.println(cur_M + " " + need_S + " " + over_S + " : " + rest_S);
			
			if(need_S > rest_S){
				continue;
			}else if(need_S == rest_S){
				sum += 1;
				sum %= 100000;
				continue;
			}else if(over_S == rest_S){
				sum += 1;
				sum %= 100000;
				continue;
			}else if(over_S < rest_S){
				break;
			}else{
				sum += DFS(rest_D - 1, cur_M - 1, rest_S - cur_M);
				sum %= 100000;
			}
		}
		
		memo.get(rest_D).get(upper_bound_M).put(rest_S, sum);
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int d = 0; d <= MAX_D; d++){
			ArrayList<HashMap<Integer, Integer>> adder = new ArrayList<HashMap<Integer,Integer>>();
			
			for(int m = 0; m <= MAX_M; m++){
				adder.add(new HashMap<Integer, Integer>());
			}
			
			memo.add(adder);
		}
		
		while (true) {
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			final int S = sc.nextInt();

			if (N == 0 && M == 0 && S == 0) {
				break;
			}
			
			System.out.println(DFS(N * N, M, S));
		}
	}

}