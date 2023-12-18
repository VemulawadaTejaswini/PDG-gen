import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int a = N;
		int b = M;
		String ss = String.valueOf(N);
		String sss = String.valueOf(M);
		String[] ans = new String[2];
		for( int i=0; i<a; i++ ){
			ans[0] += sss;
		}
		for( int i=0; i<b; i++ ){
			ans[1] += ss;
		}
		Arrays.sort(ans);
		System.out.println(ans[0].substring(4));
	}
}
