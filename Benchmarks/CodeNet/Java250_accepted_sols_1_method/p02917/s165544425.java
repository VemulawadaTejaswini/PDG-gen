import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] B = new int[N-1];
		int ans = 0,count = 0;
		for( int i=0; i<N-1; i++ ){
			B[i] = sc.nextInt();
		}
		for( int i=1; i<N-1; i++ ){
			if( B[i-1]<=B[i] ){
				count++;
				ans += B[i-1];
			}
			if( B[i-1]>B[i] ){
				ans += B[i-count-1];
				count = 0;
			}
			if( i==N-2 ){
				ans += B[i]+B[i-count];
			}        
		}
		if( N==2 ){
			ans = B[0]*2;          
        }          
		System.out.println(ans);
	}
}
