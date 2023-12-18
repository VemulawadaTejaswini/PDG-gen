import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 1000000007L;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		int Q = sc.ni();
		int M = 500000;
		int[] nums = new int[N];
		ArrayDeque<Integer>[] indices = new ArrayDeque[M];
		for (int i = 0; i < N; i++) {
			nums[i] = sc.ni()-1;
			if (indices[nums[i]]==null) {
				indices[nums[i]] = new ArrayDeque<Integer>();
			}
			indices[nums[i]].add(i);
		}
		int[][] queries = new int[Q][3];
		for (int q = 0; q < Q; q++) {
			queries[q][0] = sc.ni()-1;
			queries[q][1] = sc.ni()-1;
			queries[q][2] = q;
		}
		queries = sort(queries);
		
		int[] cur = new int[M];
		Arrays.fill(cur,-1); //cur last index of element i.
		BinaryIndexedTree bit = new BinaryIndexedTree(N);
		for (int i = 0; i < M; i++) {
			if (indices[i]!=null) {
				int index = indices[i].pollFirst();
				if (indices[i].isEmpty())
					indices[i] = null;
				cur[i] = index;
				bit.add(1, cur[i]);
			}
		}
		int[] ans = new int[Q];
		int L = 0;
		for (int[] query: queries) {
			while (L < query[0]) {
				int num = nums[L];
				int last = cur[num];
				bit.add(-1, last);
				L++;
				if (indices[num] != null) {
					int next = indices[num].pollFirst();
					if (indices[num].isEmpty())
						indices[num] = null;
					bit.add(1, next);
					cur[num] = next;
				}

			}
			ans[query[2]] = bit.sum(query[0], query[1]+1);
		}
		for (int a: ans)
			pw.println(a);
		
		pw.close();
	}
	
	//0 indexed
	static class BinaryIndexedTree {
		public int[] arr;

		public BinaryIndexedTree (int N) {
			arr = new int[N+1];
		}

		//add k to the i-th element.
		public void add(int k, int i) {
			int node = i+1;
			while (node < arr.length) {
				arr[node] += k;
				node += node & (-node);
			}
		}

		//sum up the elements from input[s_i] to input[e_i], from [s_i,e_i).
		public int sum(int s_i, int e_i) {
			return sum(e_i) - sum(s_i);
		}

		public int sum(int i) {
			int total = 0;
			int node = i;
			while (node > 0) {
				total += arr[node];
				node -= node & (-node);
			}
			return total;
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
				return arr1[0]-arr2[0];
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