import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		Query[] queries = new Query[q];
		for (int i = 0; i < q; i++) {
		    queries[i] = new Query(i, sc.nextInt() - 1, sc.nextInt() - 1);
		}
		Arrays.sort(queries);
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int[] ans = new int[q];
		int idx = 0;
		for (int i = 0; i < n; i++) {
		    if (map.containsKey(arr[i])) {
		        int x = map.get(arr[i]);
		        int left = 0;
		        int right = list.size();
		        while (true) {
		            int m = (left + right) / 2;
		            if (list.get(m) == x) {
		                list.remove(m);
		                break;
		            } else if (list.get(m) < x) {
		                left = m + 1;
		            } else {
		                right = m;
		            }
		        }
		    }
		    list.add(i);
		    map.put(arr[i], i);
		    while (idx < q && queries[idx].right == i) {
		        int left = -1;
		        int right = list.size() - 1;
		        while (right - left > 1) {
		            int m = (left + right) / 2;
		            if (list.get(m) < queries[idx].left) {
		                left = m;
		            } else {
		                right = m;
		            }
		        }
		        ans[queries[idx].idx] = list.size() - right;
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
