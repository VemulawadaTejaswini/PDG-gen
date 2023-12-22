import java.util.*;
public class Main {
	//定義関数から参照できる変数定義はこの辺
	//static Var_form Var_name

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long wk_cost = 0;
    	long wk_time = 0;
    	long min_cost = Long.MAX_VALUE;
    	String ans="TLE";
    	//Integer.MAX_VALUE;
		long N = sc.nextLong();
		long T = sc.nextLong();
		for(int i=1;i<=N;i++){
			wk_cost=sc.nextLong();
			wk_time=sc.nextLong();
			if (wk_time<=T) {
				min_cost=Math.min(min_cost,wk_cost);
			}
		}
		if (min_cost==Long.MAX_VALUE){
			System.out.println(ans);		
		}
		else{
			System.out.println(min_cost);

		}  
    }
    //関数定義
	//public static int funk(long X,long A) {
    //    return ;    
    //}
}	