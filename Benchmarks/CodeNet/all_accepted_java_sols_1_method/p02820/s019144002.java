import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int R = sc.nextInt();
		int S = sc.nextInt();
		int P = sc.nextInt();
		String T = sc.next();
		int[] cc = new int[N+1];
		char[] ch = new char[N+1];
		for( int i=1; i<=N; i++ ){
			ch[i] = T.charAt(i-1);
		}
		int ans = 0;
		for( int i=1; i<=K; i++ ){
			if( ch[i]=='r' ){
				cc[i] = P;
			}
			if( ch[i]=='s' ){
				cc[i] = R;
			}
			if( ch[i]=='p' ){
				cc[i] = S;
			}
		}
		for( int i=K+1; i<=N; i++ ){
			if( ch[i]=='r' ){
				cc[i] = P;
				if( ch[i-K]=='r' ){
					cc[i] = 0;
					ch[i] = 'a';
				}
			}
			if( ch[i]=='s' ){
				cc[i] = R;
				if( ch[i-K]=='s' ){
					cc[i] = 0;
					ch[i] = 'a';
				}
			}
			if( ch[i]=='p' ){
				cc[i] = S;
				if( ch[i-K]=='p' ){
					cc[i] = 0;
					ch[i] = 'a';
				}
			}			
		}
		for( int i=1; i<=N; i++ ){
			ans += cc[i];
		}
		System.out.println(ans);
	}
}
