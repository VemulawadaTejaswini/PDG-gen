import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Y = sc.nextInt();
		loop:for( int i=0; i<=N; i++ ){
			for( int j=0; j<=N; j++ ){
				if( i+j<=N ){
					if( i*10000 + j*5000 + (N-i-j)*1000 == Y ){
						System.out.println(i+" "+j+" "+(N-i-j));
						break loop;
					}
				}
			}
			if( i==N ){
				System.out.println(-1+" "+(-1)+" "+(-1));
			}
		}
	}
}
