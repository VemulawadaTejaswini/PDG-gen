import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		
		int cost_0_X = 0;
		int cost_X_N = 0;
		
		int[] A = new int[ M ];
		for(int i = 0; i < M ; i ++){
			A[ i ] = sc.nextInt();
			if(A[ i ] <= X ){
				cost_0_X ++ ;
			} else{
				cost_X_N ++;
			}
		}
		System.out.println(Math.min(cost_0_X , cost_X_N ));

	}
}
