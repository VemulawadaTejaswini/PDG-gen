import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] S = new String[101];
		String[] ss = new String[N];
		int[] P = new int[101];
		for( int i=0; i<N; i++ ){
			String str = sc.next();
			int a = sc.nextInt();
			S[a] = str;
			P[a] = i+1;
			ss[i] = str;
		}
		Arrays.sort(ss);
		for( int i=0; i<N; i++ ){
			for( int k=100; k>=0; k-- ){
				if( ss[i].equals(S[k]) && !(S[k].equals("A")) ){
					S[k] = "A";
					System.out.println(P[k]);
					break;
				}
			}			
		}
	}
}
