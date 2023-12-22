import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[] A = new int[9];
		for( int i=0; i<9; i++ ){
			A[i] = sc.nextInt();
		}
		int N = sc.nextInt();
		int[] B = new int[N];
		for( int i=0; i<N; i++ ){
			B[i] = sc.nextInt();
			for( int k=0; k<9; k++ ){
				if( B[i]==A[k] ){
					A[k] = 0;
					break;
				}
			}
		} 
		int ans = 0;
		if( A[0]==A[1] && A[1]==A[2] ){
			ans = 1;
		}
		if( A[3]==A[4] && A[4]==A[5] ){
			ans = 1;
		}
		if( A[6]==A[7] && A[7]==A[8] ){
			ans = 1;
		}
		if( A[0]==A[3] && A[3]==A[6] ){
			ans = 1;
		}
		if( A[1]==A[4] && A[4]==A[7] ){
			ans = 1;
		}
		if( A[2]==A[5] && A[5]==A[8] ){
			ans = 1;
		}
		if( A[0]==A[4] && A[4]==A[8] ){
			ans = 1;
		}
		if( A[2]==A[4] && A[4]==A[6] ){
			ans = 1;
		}
		System.out.println(ans==1?"Yes":"No");
	}
}

