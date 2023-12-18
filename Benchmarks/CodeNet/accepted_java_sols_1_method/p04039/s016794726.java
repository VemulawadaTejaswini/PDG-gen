import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		char[] D = new char[K];
		for( int i=0; i<K; i++ ){
			String s = sc.next();
			D[i] = s.charAt(0);          
		}
		int count = 0;
		while( count==0 ){
			loop:for( int i=0; i<String.valueOf(N).length(); i++ ){
				String ss = String.valueOf(N);
				char ch = ss.charAt(i);
				for( int j=0; j<K; j++ ){
					if( ch==D[j] ){
						N++;
						break loop;
					}
				}
				if( i==String.valueOf(N).length()-1 ){
						count++;                  
                }                  
			}
		}
		System.out.println(N);
	}  
}
