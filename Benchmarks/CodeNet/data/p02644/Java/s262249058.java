import java.io.*;
import java.util.*;
import java.math.*;
 
public class Main {
	static final int INF = 1000000007;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int H = sc.ni();
		int W = sc.ni();
		int K = sc.ni();
		int[] beg = new int[]{sc.ni()-1,sc.ni()-1};
		int[] end = new int[]{sc.ni()-1,sc.ni()-1};
		boolean[][] leaf = new boolean[H][W];
		//SNEW
		int[][][] maxMove = new int[H][W][4];
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			for (int j = 0; j < W; j++) {
				Arrays.fill(maxMove[i][j],INF);
				if (s.charAt(j)=='@')
					leaf[i][j] = true;
			}
		}
		
		if (leaf[beg[0]][beg[1]]||leaf[end[0]][end[1]]) {
			pw.println(-1);
			pw.close();
			return;
		}
		
		for (int i = 0; i < H; i++) {
			ArrayList<Integer> occ = new ArrayList<Integer>();
			occ.add(-1);
			for (int j = 0; j < W; j++) {
				if (leaf[i][j])
					occ.add(j);
			}
			occ.add(W);
			for (int r = 1; r < occ.size(); r++) {
				for (int pos = occ.get(r-1)+1; pos < occ.get(r); pos++)
					maxMove[i][pos][2] = Math.min(K,occ.get(r)-pos-1);
			}
			
			for (int r = occ.size()-1; r >= 1; r--) {
				for (int pos = occ.get(r)-1; pos > occ.get(r-1); pos--)
					maxMove[i][pos][3] = Math.min(K,pos-occ.get(r-1)-1);
			}
		}
		for (int j = 0; j < W; j++) {
			ArrayList<Integer> occ = new ArrayList<Integer>();
			occ.add(-1);
			for (int i = 0; i < H; i++) {
				if (leaf[i][j])
					occ.add(i);
			}
			occ.add(H);
			for (int r = 1; r < occ.size(); r++) {
				for (int pos = occ.get(r-1)+1; pos < occ.get(r); pos++)
					maxMove[pos][j][0] = Math.min(K,occ.get(r)-pos-1);
			}
			
			for (int r = occ.size()-1; r >= 1; r--) {
				for (int pos = occ.get(r)-1; pos > occ.get(r-1); pos--)
					maxMove[pos][j][1] = Math.min(K,pos-occ.get(r-1)-1);
			}
		}
		
		int sol1 = otherSol(H,W,beg,end,maxMove);
		if (sol1 >= -1) {
			pw.println(sol1);
			pw.close();
			return;
		}
		
		BinaryIndexedTree[] rows = new BinaryIndexedTree[H];
		for (int i = 0; i < H; i++) {
			rows[i] = new BinaryIndexedTree(W);
		}
		BinaryIndexedTree[] cols = new BinaryIndexedTree[W];
		for (int j = 0; j < W; j++)
			cols[j] = new BinaryIndexedTree(H);
		
		int[][] dist = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++)
				dist[i][j] = INF;
		}
		dist[beg[0]][beg[1]] = 0;
		rows[beg[0]].add(1, beg[1]);
		cols[beg[1]].add(1, beg[0]);
		
		ArrayDeque<int[]> bfs = new ArrayDeque<int[]>();
		bfs.add(beg);
		int ans = -1;
		int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
		
		while (!bfs.isEmpty()) {
			int[] cell = bfs.poll();

			if (cell[0]==end[0]&&cell[1]==end[1]) {
				ans = dist[end[0]][end[1]];
				break;
			}
			
			//go south (find next unvisited space)
			int newR = cell[0];
			int newC = cell[1];
			int last = cell[0]+maxMove[cell[0]][cell[1]][0];	
			if (cols[cell[1]].sum(cell[0],last+1) < last+1-cell[0]) {
				while (true) {
					int low = newR;
					int high = last;
					while (low < high) {
						int med = (low+high)/2;
						if (cols[cell[1]].sum(low, med+1) == (med-low+1)) {
							//all spaces are visited
							low = med+1;
						} else {
							high = med;
						}
					}
					//next unvisited space is {low,newC}
					if (low > newR) {
						dist[low][newC] = dist[cell[0]][cell[1]]+1;
						rows[low].add(1, cell[1]);
						cols[cell[1]].add(1,low);
						bfs.add(new int[]{low,newC});
						newR = low;
					} else {
						break;
					}
				}
			}

			
			//go north
			newR = cell[0];
			newC = cell[1];
			last = cell[0]-maxMove[cell[0]][cell[1]][1];
			if (cols[cell[1]].sum(last,cell[0]+1) < cell[0]+1-last) {
				while (true) {
					int low = last;
					int high = newR;
					while (low < high) {
						int med = (low+high+1)/2;
						if (cols[cell[1]].sum(med,high+1)== (high+1-med)) {
							//all spaces are visited
							high = med-1;
						} else {
							low = med;
						}
					}
					//next unvisited space is {low,newC}
					if (low < newR) {
						dist[low][newC] = dist[cell[0]][cell[1]]+1;
						rows[low].add(1, cell[1]);
						cols[cell[1]].add(1,low);
						bfs.add(new int[]{low,newC});
						newR = low;
					} else {
						break;
					}
				}
			}
			
			//go east
			newR = cell[0];
			newC = cell[1];
			last = cell[1]+maxMove[cell[0]][cell[1]][2];
			
			if (rows[cell[0]].sum(cell[1],last+1) < last+1-cell[1]) {
				while (true) {
					int low = newC;
					int high = last;
					while (low < high) {
						int med = (low+high)/2;
						if (rows[cell[0]].sum(low, med+1) == (med-low+1)) {
							//all spaces are visited
							low = med+1;
						} else {
							high = med;
						}
					}
					
					//next unvisited space is {newR,low}
					if (low > newC) {
						dist[newR][low] = dist[cell[0]][cell[1]]+1;
						rows[cell[0]].add(1,low);
						cols[low].add(1,cell[0]);
						bfs.add(new int[]{newR,low});
						newC = low;
					} else {
						break;
					}
				}
			}
			
			//go west, young man!
			newR = cell[0];
			newC = cell[1];
			last = cell[1]-maxMove[cell[0]][cell[1]][3];
			if (rows[cell[0]].sum(last,cell[1]+1) < cell[1]+1-last) {
				while (true) {
					int low = last;
					int high = newC;
					while (low < high) {
						int med = (low+high+1)/2;
						if (rows[cell[0]].sum(med, high+1) == (high+1-med)) {
							//all spaces are visited
							high = med-1;
						} else {
							low = med;
						}
					}
					
					//next unvisited space is {newR,low}
					if (low < newC) {
						dist[newR][low] = dist[cell[0]][cell[1]]+1;
						rows[cell[0]].add(1,low);
						cols[low].add(1,cell[0]);
						bfs.add(new int[]{newR,low});
						newC = low;
					} else {
						break;
					}
				}
			}
		}
		pw.println(ans);
		
		pw.close();
	}
	
	public static int otherSol(int H, int W, int[] beg, int[] end, int[][][] maxMove) {
		int[][] dist = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++)
				dist[i][j] = INF;
		}
		dist[beg[0]][beg[1]] = 0;
		ArrayDeque<int[]> bfs = new ArrayDeque<int[]>();
		bfs.add(beg);
		int ans = -1;
		int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
		long t1 = System.currentTimeMillis();
		while (!bfs.isEmpty()) {
			if (System.currentTimeMillis()-t1 >= 900) {
				//this solution TLEs
				return -5;
			}
			int[] cell = bfs.poll();
			if (cell[0]==end[0]&&cell[1]==end[1]) {
				ans = dist[end[0]][end[1]];
				break;
			}
			
			for (int d = 0; d < 4; d++) {
				for (int m = maxMove[cell[0]][cell[1]][d]; m >= 1; m--) {
					int newR = cell[0]+dirs[d][0]*m;
					int newC = cell[1]+dirs[d][1]*m;
					if (dist[newR][newC]==INF) {
						dist[newR][newC] = dist[cell[0]][cell[1]]+1;
						bfs.add(new int[]{newR,newC});
					}
				}
			}
		}
		
		return ans;
	}
	
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