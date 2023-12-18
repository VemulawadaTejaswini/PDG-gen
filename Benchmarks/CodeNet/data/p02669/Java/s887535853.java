import java.util.*;

public class Main {
    static int m2;
    static int m3;
    static int m5;
    static int a1;
    static HashMap<Long, Long> map = new HashMap<>();
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
		    long n = sc.nextLong();
		    m2 = sc.nextInt();
		    m3 = sc.nextInt();
		    m5 = sc.nextInt();
		    a1 = sc.nextInt();
		    map.clear();
		    map.put(0L, 0L);
		    map.put(1L, (long)a1);
		    sb.append(dfw(n)).append("\n");
		}
		System.out.print(sb);
	}
	
	static long dfw(long x) {
	    if (map.containsKey(x)) {
	        return map.get(x);
	    }
	    long min;
	    if (x <= Long.MAX_VALUE / a1) {
	        min = x * a1;
	    } else {
	        min = Long.MAX_VALUE;
	    }
	    if (x % 2 == 0) {
	        min = Math.min(min, dfw(x / 2) + m2);
	    } else {
	        min = Math.min(min, dfw((x + 1) / 2) + a1 + m2);
	        min = Math.min(min, dfw((x - 1) / 2) + a1 + m2);
	    }
	    if (x % 3 == 0) {
	        min = Math.min(min, dfw(x / 3) + m3);
	    } else {
	        long mod = x % 3;
	        if (x > 3) {
	            min = Math.min(min, dfw((x - mod) / 3) + a1 * mod + m3);
	        }
	        min = Math.min(min, dfw((x + (3 - mod)) / 3) + a1 * (3 - mod) + m3);
	    }
	    if (x % 5 == 0) {
	        min = Math.min(min, dfw(x / 5) + m5);
	    } else {
	        long mod = x % 5;
	        if (x > 5) {
	            min = Math.min(min, dfw((x - mod) / 5) + a1 * mod + m5);
	        }
	        min = Math.min(min, dfw((x + (5 - mod)) / 5) + a1 * (5 - mod) + m5);
	    }
	    map.put(x, min);
	    return min;
	}
}
