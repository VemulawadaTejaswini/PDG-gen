import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long H = sc.nextLong();
		int N = sc.nextInt();
		long ans = 0;
		for( int i=0; i<N; i++ ){
			long a = sc.nextLong();
			ans += a;
		}
		System.out.println(ans>=H?"Yes":"No");
	}
}
