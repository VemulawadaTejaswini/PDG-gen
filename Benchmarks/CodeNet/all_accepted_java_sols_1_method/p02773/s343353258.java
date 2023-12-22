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
		int count = 1;
		int countAns = 1;
		int maxium = 0;
		if( N == 1 ){
			System.out.println(S[0]);
		}else{

		for( int i=0; i<N-1; i++ ){
			if( S[i].equals(S[i+1]) ){
				count++;
			}
			if( !(S[i].equals(S[i+1])) || i==N-2 ){
				maxium = Math.max(count,maxium);
				count = 1;	
			}
		}
		for( int i=0; i<N-1; i++ ){
			if( S[i].equals(S[i+1]) ){
				countAns++;
			}
			if( !(S[i].equals(S[i+1])) || i==N-2 ){
				if( countAns==maxium ){
					System.out.println(S[i]);
				}
				countAns = 1;	
			}
			if( !(S[i].equals(S[i+1])) && maxium==1 && i==N-2 ){
				System.out.println(S[N-1]);              
            }              
		}

		}
	}
}