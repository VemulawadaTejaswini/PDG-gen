import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Fish, Integer> posMap = new HashMap<>();
	    HashMap<Fish, Integer> negMap = new HashMap<>();
	    int zeos = 0;
	    for (int i = 0; i < n; i++) {
	        boolean isPos = true;
	        long a = sc.nextLong();
	        long b = sc.nextLong();
	        if (a == 0 && b == 0) {
	            zeos++;
	            continue;
	        }
	        if (a < 0) {
	            a = -a;
	            b = -b;
	        }
	        if (b < 0) {
	            isPos = false;
	            b = -b;
	        }
	        if (a == 0) {
	            isPos = true;
	            b = 1;
	        } else if (b == 0) {
	            isPos = false;
	            a = 1;
	        }
	        if (isPos) {
	            Fish f = new Fish(a, b);
	            if (posMap.containsKey(f)) {
	                posMap.put(f, posMap.get(f) + 1);
	            } else {
	                posMap.put(f, 1);
	            }
	        } else {
	            Fish f = new Fish(b, a);
	            if (negMap.containsKey(f)) {
	                negMap.put(f, negMap.get(f) + 1);
	            } else {
	                negMap.put(f, 1);
	            }
	        }
	    }
        long ans = 1;
        for (Map.Entry<Fish, Integer> entry : posMap.entrySet()) {
            if (negMap.containsKey(entry.getKey())) {
                int x = entry.getValue();
                int y = negMap.get(entry.getKey());
                ans *= (pow(2, x) - 1 + pow(2, y) - 1 + 1 + MOD) % MOD;
                ans %= MOD;
                negMap.remove(entry.getKey());
            } else {
                ans *= pow(2, entry.getValue());
                ans %= MOD;
            }
        }
        for (Map.Entry<Fish, Integer> entry : negMap.entrySet()) {
            ans *= pow(2, entry.getValue());
            ans %= MOD;
        }
        ans += zeos;
        ans += MOD - 1;
        ans %= MOD;
		System.out.println(ans);
	}
	
	static long pow(long x, long p) {
	    if (p == 0) {
	        return 1;
	    } else {
	        if (p % 2 == 0) {
	            return pow(x * x % MOD, p / 2);
	        } else {
	            return pow(x, p - 1) * x % MOD;
	        }
	    }
	}
	
	static class Fish {
	    long a;
	    long b;
	    
	    public Fish(long a, long b) {
	        this.a = a;
	        this.b = b;
	        if (a != 0 && b != 0) {
	            long gcd = getGCD(a, b);
	            this.a = a / gcd;
	            this.b = b / gcd;
	        } else if (a == 0) {
	            this.b = 1;
	        } else if (b == 0) {
	            this.a = 1;
	        }
	    }
	    
	    public int hashCode() {
	        return (int)(a + b);
	    }
	    
	    public boolean equals(Object o) {
	        Fish f = (Fish) o;
	        return a == f.a && b == f.b;
	    }
	    
	    public String toString() {
	        return a + ":" + b;
	    }
	    
	    private long getGCD(long x, long y) {
	        if (x % y == 0) {
	            return y;
	        } else {
	            return getGCD(y, x % y);
	        }
	    }
	}
}
 