import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		if ( (b-a)%2 == 0 ) {
			System.out.println((b-a)/2);
			System.exit(0);
		}

		// 出力
		long d = Math.min(n-b,a-1l) + 1l + (b-a)/2l;
		System.out.println(d);
	}
}