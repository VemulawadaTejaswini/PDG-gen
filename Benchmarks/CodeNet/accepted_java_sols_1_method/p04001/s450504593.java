import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		S = S + "a";
		long[][] num = new long[S.length()-1][S.length()+1];
		long answer = 0;
		for( int i=0; i<S.length()-1; i++ ){
			for( int j=i+1; j<S.length(); j++ ){
				String ss = S.substring(i,j);
				num[i][j] = Long.parseLong(ss);
				long a=2,b=2;
				if( i==0 || i==1 ){
					a = 1;
				}else{
					for( int m=0; m<i-2; m++ ){
						a=2*a;
					}
				}
				if( j==S.length()-2 || j==S.length()-1 ){
					b = 1;                  
                }else{                  
					for( int m=0; m<S.length()-j-3; m++ ){
						b=2*b;
					}
                }	                  
				num[i][j] *= a*b;
				answer += num[i][j];
			}
		}
		System.out.println( answer );
	}
}
