import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 1000000007L;
	static final int INF = 50000000;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int H = sc.ni();
		int W = sc.ni();
		int M = sc.ni();
		int[][] nums = new int[M][2];
		SegmentTree st = new SegmentTree(H);
		int[] arr = new int[H];
		for (int i = 0; i < M; i++) {
			nums[i] = new int[] {sc.ni()-1,sc.ni()-1};
			arr[nums[i][0]] += 1;
			st.update(nums[i][0],arr[nums[i][0]]);
		}
		nums = sort(nums);
		
		int ans = 0;
		int i = 0;
		while (i < M) {
			int curW = nums[i][1];
			int j = i;
			ArrayList<int[]> updates = new ArrayList<int[]>();
			while (j < M && nums[j][1]==curW) {
				updates.add(nums[j]);
				arr[nums[j][0]] -= 1;
				st.update(nums[j][0],arr[nums[j][0]]);
				j++;
			}
			int val = (j-i)+st.query(0, H-1);
			ans = Math.max(ans, val);
			for (int[] up: updates) {
				arr[up[0]] += 1;
				st.update(up[0], arr[up[0]]);
			}
			i = j;
		}
		pw.println(ans);
		pw.close();
	}
	
	//No lazy propagation. 0 indexed. Very fast.
	static class SegmentTree {
		public int[] tree;
		public int NONE;
		public int N;

		//Zero initialization
		public SegmentTree(int n) {
			N = n;
			tree = new int[4*N+1];
			NONE = Integer.MIN_VALUE; //set this manually (Long.MIN_VALUE for max-st, Long.MAX_VALUE for min-st, 0 for sum,xor-st, etc.)
		}

		public int merge(int a, int b) {
			return Math.max(a,b); //set this manually
		}

		public int query(int i, int j) {
			return query(0,0,N-1,i,j);
		}

		public void update(int arrIndex, int val) {
			update(0,0,N-1,arrIndex,val);
		}

		private int query(int treeIndex, int lo, int hi, int i, int j) {
			// query for arr[i..j]
			if (lo > j || hi < i)
				return NONE;
			if (i <= lo && j >= hi)
				return tree[treeIndex];
			int mid = lo + (hi - lo) / 2;

			if (i > mid)
				return query(2 * treeIndex + 2, mid + 1, hi, i, j);
			else if (j <= mid)
				return query(2 * treeIndex + 1, lo, mid, i, j);

			int leftQuery = query(2 * treeIndex + 1, lo, mid, i, mid);
			int rightQuery = query(2 * treeIndex + 2, mid + 1, hi, mid + 1, j);

			// merge query results
			return merge(leftQuery, rightQuery);
		}

		private void update(int treeIndex, int lo, int hi, int arrIndex, int val) {
			if (lo == hi) {
				tree[treeIndex] = val;
				return;
			}

			int mid = lo + (hi - lo) / 2;

			if (arrIndex > mid)
				update(2 * treeIndex + 2, mid + 1, hi, arrIndex, val);
			else if (arrIndex <= mid)
				update(2 * treeIndex + 1, lo, mid, arrIndex, val);

			// merge updates
			tree[treeIndex] = merge(tree[2 * treeIndex + 1], tree[2 * treeIndex + 2]);
		}
	}
	
	public static int[][] sort(int[][] arr) {
		//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i < arr.length; i++) {
			int randomPosition = rgen.nextInt(arr.length);
			int[] temp = arr[i];
			arr[i] = arr[randomPosition];
			arr[randomPosition] = temp;
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] arr1, int[] arr2) {
				return arr1[1]-arr2[1];
				//Ascending order.
			}
		});
		return arr;
	}

    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        }
        
        int ni() { 
            return Integer.parseInt(next()); 
        }
  
        long nl() { 
            return Long.parseLong(next()); 
        } 
  
        double nd() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() {
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            return str;
        }
    }
}