import java.util.*;


class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] A = new int[ N ];
		int[] std = new int[ N + 1] ;
		
		for(int i = 0 ; i < N ; i ++){
			A[ i ] = sc.nextInt();
			
			if(i == 0){
				std[ 0 ] = Math.abs( A[0] - 0 ); 
			}else if(i == N - 1){
				std[ N ] = Math.abs( 0 - A[N - 1] );
				std[ i ] = Math.abs( A[i] - A[ i - 1] );
			}else{
				std[ i ] = Math.abs( A[i] - A[ i - 1] );
			}
		}
		
		int sum = 0;
		for(int i = 0 ; i < N + 1; i ++){ // 辞める番号
			sum = sum + std[i] ;
		}
		
		
		System.out.println( sum + Math.abs( A[1] - 0 ) - std[0] - std[1] );
		
		for(int i = 1 ; i < N - 1 ;i ++){
			System.out.println( sum + Math.abs( A[i + 1] - A[ i - 1]  ) - std[i] - std[i + 1] );
		}
		
		System.out.println( sum + Math.abs( 0 - A[ N - 2] ) - std[N - 1] - std[N] );
	}
}
