import java.util.*;

public class Main {
	
	
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong(),b=sc.nextLong();
		long c = sc.nextInt(),d=sc.nextInt();
		
		long l = lcm(c,d);
		a--;
		long ans1 = a-a/c-a/d+a/l;
		long ans2 = b-b/c-b/d+b/l;
		
		long ans = ans2-ans1;
		
		System.out.println(ans);
		
		
		
	}
		


}
