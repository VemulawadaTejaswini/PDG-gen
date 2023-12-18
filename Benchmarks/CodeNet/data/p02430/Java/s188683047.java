import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long max = 1L << n;
		StringBuilder sb = new StringBuilder();
		for (long i = 0; i < max; i++) {
		    if (!check(i, k)) {
		        continue;
		    }
		    sb.append(i).append(":");
		    long x = i;
		    for (int j = 0; j <= 18 && x > 0; j++) {
		        if (x % 2 == 1) {
		            sb.append(" ").append(j);
		        }
		        x >>= 1;
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
	}
	
	static boolean check(long x, int count) {
	    long cnt = 0;
	    while (x > 0) {
	        cnt += x % 2;
	        x >>= 1;
	    }
	    return cnt == count;
	}
}

