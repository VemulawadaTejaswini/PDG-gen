import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] S = new String[N];
		for( int i=0; i<N; i++ ){
			S[i] = sc.next();
		}
		Arrays.sort(S);
		int count = 0;
		for( int i=1; i<N; i++ ){
			if( S[i].equals(S[i-1]) ){
				count++;
			}
		}
		System.out.println(N-count);
	}
}