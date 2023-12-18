import java.util.*;

public class Main {
    static int[] xArr;
    static int[] yArr;
    static long[] cArr;
    static long[][] xValues;
    static long[][] yValues;
    static int n;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		xArr = new int[n];
		yArr = new int[n];
		cArr = new long[n];
		long[] base = new long[n];
		for (int i = 0; i < n; i++) {
		    xArr[i] = sc.nextInt();
		    yArr[i] = sc.nextInt();
		    cArr[i] = sc.nextInt();
		    base[i] = Math.min(Math.abs(xArr[i]), Math.abs(yArr[i])) * cArr[i];
		}
		xValues = new long[1 << n][];
		yValues = new long[1 << n][];
		xValues[0] = base;
		yValues[0] = base;
		for (int i = 0; i < n; i++) {
		    setX(base, 0, i);
		    setY(base, 0, i);
		}
		long[] ans = new long[n + 1];
		Arrays.fill(ans, Long.MAX_VALUE);
		for (int i = 0; i < (1 << n); i++) {
		    for (int j = 0; j < (1 << n); j++) {
		        if ((i & j) != 0) {
		            continue;
		        }
		        int idx = getIdx(i | j);
		        long sum = 0;
		        for (int k = 0; k < n; k++) {
		            sum += Math.min(xValues[i][k], yValues[j][k]);
		        }
		        ans[idx] = Math.min(ans[idx], sum);
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
		    sb.append(ans[i]).append("\n");
		}
		System.out.print(sb);
	}
	
	static int getIdx(int x) {
	    int count = 0;
	    while (x > 0) {
	        count += x % 2;
	        x /= 2;
	    }
	    return count;
	}
	
	static void setX(long[] base, int mask, int idx) {
	    mask = (mask | (1 << idx));
	    if (xValues[mask] != null) {
	        return;
	    }
	    xValues[mask] = (long[])base.clone();
	    for (int i = 0; i < n; i++) {
	        xValues[mask][i] = Math.min(xValues[mask][i], Math.abs(xArr[i] - xArr[idx]) * cArr[i]);
	    }
	    for (int i = 0; i < n; i++) {
	        if ((mask & (1 << i)) != 0) {
	            continue;
	        }
	        setX(xValues[mask], mask, i);
	    }
	}

	static void setY(long[] base, int mask, int idx) {
	    mask = (mask | (1 << idx));
	    if (yValues[mask] != null) {
	        return;
	    }
	    yValues[mask] = (long[])base.clone();
	    for (int i = 0; i < n; i++) {
	        yValues[mask][i] = Math.min(yValues[mask][i], Math.abs(yArr[i] - yArr[idx]) * cArr[i]);
	    }
	    for (int i = 0; i < n; i++) {
	        if ((mask & (1 << i)) != 0) {
	            continue;
	        }
	        setY(yValues[mask], mask, i);
	    }
	}
	
}
