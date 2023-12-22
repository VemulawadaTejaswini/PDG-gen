
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long ans = 1001001001100L;
		for(long i=1; i*i<=n; i++) {
			if(n%i==0) {
				long x = n/i;
				long y = i;
				ans = Math.min(ans, f(x,y));
				//System.out.println(x+" "+y+" "+ans);
			}
		}
		System.out.println(ans);
		sc.close();
	}

	private long f(long x, long y) {
		return Math.max(k(x), k(y));
	}

	private long k(long x) {
		long ret = 0;
		while(x>0) {
			ret++;
			x/=10;
		}
		return ret;
	}
}
