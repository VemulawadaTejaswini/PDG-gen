import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int N = S.length();
		int a = 0,b = 0;
		for( int i=0; i<N; i++ ){
			if( S.charAt(i)=='0' ){
				a++;
			}else{
				b++;
			}
		}
		System.out.println(Math.min(a,b)*2);
	}
}
