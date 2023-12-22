import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		long n = sc.nextLong();

		long f = 0;
		for ( long i=1; i<=n; i++ ) {
			if ( i%3==0 || i%5==0 ) {
				continue;
			} else {
				f = f + i;
			}
		}
		System.out.println(f);
	}
}
