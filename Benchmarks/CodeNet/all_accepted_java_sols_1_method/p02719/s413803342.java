import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
		long k = sc.nextLong();

		while ( n*2l >= k ) {
			if ( n>=k ) {
				n = n%k;
			} else if ( n*2l>=k ) {
				n = Math.abs(n-k);
			}
		}
		System.out.println(n);
	}
}