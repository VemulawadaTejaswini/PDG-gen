import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long X = sc.nextLong();
		long[] five = new long[121];
		long A = 0;
		for( int i=1; i<=120; i++ ){
			A++;
			five[i] = A*A*A*A*A;
		}
		loop:for( int i=0; i<=120; i++ ){
			for( int k=0; k<=120; k++ ){
				if( five[i]-five[k]==X ){
					System.out.println(i+" "+k);
					break loop;
				}
				if( five[i]+five[k]==X ){
					System.out.println(i+" "+(-k));
					break loop;
				}			
			}
		}
	}
}
