import java.util.*;
import java.io.*;

public class Main {
    static int[] values;
    static int[] weights;
    static int n;
    static ArrayList<TreeMap<Integer, Integer>> dp = new ArrayList<>();
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		values = new int[n + 1];
		weights = new int[n + 1];
		dp.add(new TreeMap<>());
		for (int i = 1; i <= n; i++) {
		    String[] line = br.readLine().split(" ", 2);
		    values[i] = Integer.parseInt(line[0]);
		    weights[i] = Integer.parseInt(line[1]);
    		dp.add(new TreeMap<>());
		}
		setDP(1, 0, 0);
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    String[] line = br.readLine().split(" ", 2);
		    sb.append(dfw(Integer.parseInt(line[0]), Integer.parseInt(line[1]))).append("\n");
		}
		System.out.print(sb);
	}
	
	static void setDP(int idx, int weight, int value) {
	    if (idx > n) {
	        return;
	    }
	    if (dp.get(idx).size() == 0 || dp.get(idx).floorEntry(weight).getValue() < value) {
	        dp.get(idx).put(weight, value);
	        setDP(idx * 2, weight, value);
	        setDP(idx * 2 + 1, weight, value);
	    }
	    weight += weights[idx];
	    value += values[idx];
	    if (dp.get(idx).size() == 0 || dp.get(idx).floorEntry(weight).getValue() < value) {
	        dp.get(idx).put(weight, value);
	        setDP(idx * 2, weight, value);
	        setDP(idx * 2 + 1, weight, value);
	    }
	}
	static int dfw(int idx, int value) {
	    return dp.get(idx).floorEntry(value).getValue();
	}
}
