

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        long K=gl();
        Map<Long, Boolean> m = new HashMap<Long, Boolean>();
        
        //System.out.println(Math.min(ans,  ans2));

        long ans =0;
        long mod =0;
        while(true) {
        	ans++;
        	long mod2 = modpow(10, ans-1, K);
        	mod2 = (7%K * mod2)%K;
        	mod = (mod+mod2)%K;
        	if(m.containsKey(mod)) {
        		System.out.println(-1);
        		return;
        	} else {
        		m.put(mod, true);
        	}
        	if(mod == 0) {
        		break;
        	}
        }
        System.out.println(ans);
	}
	
	public static long modpow(long a, long n, long mod) {
		long res=1;
		while(n>0) {
			if((n & 1) == 1) res=res*a%mod;
			a=a*a%mod;
			n=n>>1;
		}
		
		return res;
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}