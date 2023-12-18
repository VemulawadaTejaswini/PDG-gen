import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class Main {
	
	public static void update(int[] BIT, int idx, int val) {
		for (; idx < BIT.length; idx += idx & (-idx)) {
			BIT[idx] += val;
		}
	}
	
	public static int query(int[] BIT, int idx) {
		int ans = 0;
		for (; idx > 0; idx -= idx & (-idx)) {
			ans += BIT[idx];
		}
		return ans;
	}
	
    public static void main(String args[] ) throws Exception {
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		input = reader.readLine().split(" ");
		int n = Integer.parseInt(input[0]), q = Integer.parseInt(input[1]);
		input = reader.readLine().split(" ");
		int[] c = new int[n + 1];
		for (int i = 0; i < n; i++) {
			c[i + 1] = Integer.parseInt(input[i]);
		}
		List<ArrayList<int[]>> queries = new ArrayList<ArrayList<int[]>>();
		for (int i = 0; i <= n; i++) {
			queries.add(new ArrayList<int[]>());
		}
		for (int i = 0; i < q; i++) {
			input = reader.readLine().split(" ");
			int[] query = new int[3];
			query[0] = Integer.parseInt(input[0]);
			query[1] = Integer.parseInt(input[1]);
			query[2] = i;
			queries.get(query[1]).add(query);
		}
		int[] BIT = new int[n + 1];
		Map<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		int[] ans = new int[q];
		for (int i = 1; i <= n; i++) {
			if (map.containsKey(c[i])) {
				update(BIT, map.get(c[i]), -1);
			}
			map.put(c[i], i);
			update(BIT, i, 1);
			idx = 0;
			while (idx < queries.get(i).size()) {
				ans[queries.get(i).get(idx)[2]] = query(BIT, queries.get(i).get(idx)[1]) - query(BIT, queries.get(i).get(idx)[0] - 1);
				idx++;
			}
		}
		for (int i = 0; i < q; i++) {
			out.println(ans[i]);
		}
		out.flush();
		out.close();
    }
	

}
