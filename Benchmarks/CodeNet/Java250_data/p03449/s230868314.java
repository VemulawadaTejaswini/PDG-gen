import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] A = new int[2][N];
		
		for(int i = 0 ; i < 2 * N ; i ++){
			if(i < N){
				A[0][i] = sc.nextInt();
			}else {
				A[1][i - N] = sc.nextInt();
			}
//			System.out.printf(" A[ %d ][ %d ] = %d \n" , (i < N) ? 0:1 ,(i < N) ? i: i - N,
//			(i < N) ? A[0][i] : A[1][i - N]  );
		}
		
		int maxCandies = 0;
		
		
		for(int i = 0 ; i < N ; i++){
			int sum_i = 0;
			for(int j = 0 ; j < N ; j++){
				if(j < i ){
					sum_i = sum_i + A[0][j];
				}else if(j == i){
					sum_i = sum_i + A[0][j] + A[1][j] ;
				}else {
					sum_i = sum_i + A[1][j];
				}
			}
			if(maxCandies < sum_i){
				maxCandies = sum_i;
			}
		}
		
		System.out.println(maxCandies);
	}
}
