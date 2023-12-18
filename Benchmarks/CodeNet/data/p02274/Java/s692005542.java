import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		    map.put(arr[i], 0);
		}
		int idx = 1;
		for (int x : map.keySet()) {
		    map.put(x, idx);
		    idx++;
		}
		BinaryIndexedTree bit = new BinaryIndexedTree(idx);
		long total = 0;
		for (int i = 0; i < n; i++) {
		    total += bit.getSum(map.get(arr[i]), idx - 1);
		    bit.add(map.get(arr[i]), 1);
		}
		System.out.println(total);
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
