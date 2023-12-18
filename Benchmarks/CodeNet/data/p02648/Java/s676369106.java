import java.util.*;

public class Main {
    static int[] values;
    static int[] weights;
    static int[] maxes;
    static int n;
    static HashMap<Integer, HashMap<Integer, Integer>> dp = new HashMap<>();
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		values = new int[n + 1];
		weights = new int[n + 1];
		maxes = new int[n + 1];
		for (int i = 1; i <= n; i++) {
		    values[i] = sc.nextInt();
		    weights[i] = sc.nextInt();
		}
		setMax(1, 0);
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    sb.append(dfw(sc.nextInt(), sc.nextInt())).append("\n");
		}
		System.out.print(sb);
	}
	
	static void setMax(int idx, int value) {
	    if (idx > n) {
	        return;
	    }
	    maxes[idx] += value + weights[idx];
	    setMax(idx * 2, maxes[idx]);
	    setMax(idx * 2 + 1, maxes[idx]);
	}
	
	static int dfw(int idx, int value) {
	    if (idx <= 0) {
	        return 0;
	    }
	    if (dp.containsKey(idx)) {
	        if (dp.get(idx).containsKey(value)) {
	            return dp.get(idx).get(value);
	        }
	    } else {
	        dp.put(idx, new HashMap<>());
	    }
	    int max = 0;
	    if (value < weights[idx]) {
	        max = dfw(idx / 2, value);
	    } else if (maxes[idx] <= value) {
	        max = dfw(idx / 2, value - weights[idx]) + values[idx];
	    } else {
	        max = Math.max(dfw(idx / 2, value), dfw(idx / 2, value - weights[idx]) + values[idx]);
	    }
	    dp.get(idx).put(value, max);
	    return max;
	}
}
