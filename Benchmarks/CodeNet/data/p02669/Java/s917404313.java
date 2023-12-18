import java.util.*;
import java.math.BigDecimal;

class Main {
	private static Map<Long,Long> longMap = new HashMap<>();
	private static long a;
	private static long b;
	private static long c;
	private static long d;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
    	for(int i = 0; i < t; i++) {
    		long n = sc.nextLong();
    		a = sc.nextLong();
    		b = sc.nextLong();
    		c = sc.nextLong();
    		d = sc.nextLong();
    		longMap = new HashMap<>();
    		System.out.println(solve(n));
    	}
    }
	
	public static long solve(long n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return d;
		}
		if(longMap.containsKey(n)){
			return longMap.get(n);
		}
		long l2 = (n / 2) * 2;
		long b2 = ((n+1) / 2) * 2; 
		long l3 = (n / 3) * 3;
		long b3 = ((n+2) / 3) * 3;
		long l5 = (n / 5) * 5;
		long b5 = ((n+4)/ 5) * 5;
		
		long ans = Long.MAX_VALUE;
		if(new BigDecimal(d).multiply(new BigDecimal(n)).compareTo(new BigDecimal(ans)) == -1) {
			ans = n * d;
		}
		ans = Math.min(ans, solve(l2 / 2) + (n - l2) * d + a);
		ans = Math.min(ans, solve(b2 / 2) + (b2 - n) * d + a);
		ans = Math.min(ans, solve(l3 / 3) + (n - l3) * d + b);
		ans = Math.min(ans, solve(b3 / 3) + (b3 - n) * d + b);
		ans = Math.min(ans, solve(l5 / 5) + (n - l5) * d + c);
		ans = Math.min(ans, solve(b5 / 5) + (b5 - n) * d + c);
		
		longMap.put(n, ans);
		return ans;
	}
}