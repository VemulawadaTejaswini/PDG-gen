import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int n = sc.nextInt();

		int c = 0;
		int o = n+1;

		for ( int i=0; i<n; i++ ) {
			int p = sc.nextInt();
			if ( o > p ) {
				c++;
				o = p;
			}
		}
		System.out.println(c);
	}
}