import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] S = new String[N];
		for( int i=0; i<N; i++ ){
			S[i] = sc.next();
			String[] str = new String[10];
			for( int j=0; j<10; j++ ){
				str[j] = String.valueOf(S[i].charAt(j));
			}
			Arrays.sort(str);
			S[i] = "A";
			for( int j=0; j<10; j++ ){
				S[i] += str[j];
			}
		}
		Arrays.sort(S);
		long ans = 0;
		long count = 1;
		for( int i=1; i<N; i++ ){        
			if( S[i].equals(S[i-1]) ){
				count++;
            }              
			if( !(S[i].equals(S[i-1])) || i==N-1 ){           
				ans += count*(count-1)/2;           
				count = 1;
			}
		}   
		System.out.println(ans);
	}
}
