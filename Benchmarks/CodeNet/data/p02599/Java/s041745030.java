import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 2);
 		int n = Integer.parseInt(first[0]);
		int q = Integer.parseInt(first[1]);
		String[] nums = br.readLine().split(" ", n);
		Query[] queries = new Query[q];
		for (int i = 0; i < q; i++) {
		    String[] line = br.readLine().split(" ", 2);
		    queries[i] = new Query(i, Integer.parseInt(line[0]), Integer.parseInt(line[1]));
		}
		Arrays.sort(queries);
		int[] idxes = new int[n + 1];
		BinaryIndexedTree bit = new BinaryIndexedTree(n + 1);
		int[] ans = new int[q];
		int idx = 0;
		for (int i = 0; i < n; i++) {
		    int y = Integer.parseInt(nums[i]);
		    if (idxes[y] > 0) {
		        bit.add(idxes[y], - 1);
		    }
		    bit.add(i + 1, 1);
		    idxes[y] = i + 1;
		    while (idx < q && queries[idx].right == i + 1) {
		        ans[queries[idx].idx] = bit.getSum(queries[idx].left, queries[idx].right);
		        idx++;
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int x : ans) {
		    sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
	
	static class Query implements Comparable<Query> {
	    int idx;
	    int left;
	    int right;
	    
	    public Query(int idx, int left, int right) {
	        this.idx = idx;
	        this.left = left;
	        this.right = right;
	    }
	    
	    public int compareTo(Query another) {
	        return right - another.right;
	    }
	}
}

class BinaryIndexedTree {
    int size;
    int[] tree;
    
    public BinaryIndexedTree(int size) {
        this.size = size;
        tree = new int[size];
    }
    
    public void add(int idx, int value) {
        int mask = 1;
        while (idx < size) {
            if ((idx & mask) != 0) {
                tree[idx] += value;
                idx += mask;
            }
            mask <<= 1;
        }
    }
    
    public int getSum(int from, int to) {
        return getSum(to) - getSum(from - 1);
    }
    
    public int getSum(int x) {
        int mask = 1;
        int ans = 0;
        while (x > 0) {
            if ((x & mask) != 0) {
                ans += tree[x];
                x -= mask;
            }
            mask <<= 1;
        }
        return ans;
    }
}
