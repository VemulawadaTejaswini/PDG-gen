import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[] y = new int[n];
        int[] order = new int[n];
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt()-1;
            int v = sc.nextInt();
            order[x] = i;
            y[x] = v;
        }
        UnionFindTree uf = new UnionFindTree(n);
        Deque<Integer> dq = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();
        dq.add(0);
        int size = 0;
        for(int i = 1; i < n; i++){
            boolean flg = false;
            while(dq.size() > 0){
                int j = dq.pollLast();
                if (y[i] > y[j]){
                    uf.union(j, i);
                    if(flg)st.push(j);
                    flg = true;
                }else{
                    st.push(j);
                    break;
                }
            }
            while(st.size() > 0){
                dq.addLast(st.pop());
            }
            if(!flg)dq.addLast(i);
        }
        for(int i = 0; i < n; i++){
            ans[order[i]] = uf.size(i);
        }
        for(int v : ans){
            pw.println(v);
        }
        pw.flush();
    }

    static class GeekInteger {
        public static void save_sort(int[] array) {
            shuffle(array);
            Arrays.sort(array);
        }
 
        public static int[] shuffle(int[] array) {
            int n = array.length;
            Random random = new Random();
            for (int i = 0, j; i < n; i++) {
                j = i + random.nextInt(n - i);
                int randomElement = array[j];
                array[j] = array[i];
                array[i] = randomElement;
            }
            return array;
        }
 
    }
}

class UnionFindTree {
	int[] parent;
	int[] rank;
	int[] size;
	
	public UnionFindTree(int size) {
		this.parent = new int[size];
		this.rank = new int[size];
		this.size = new int[size];
		
		for (int i = 0; i < size; i++) {
			makeSet(i);
		}
	}
	
	public void makeSet(int i) {
		parent[i] = i;
		rank[i] = 0;
		size[i] = 1;
	}
	
	public void union(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);
		if (rank[xRoot] > rank[yRoot]) { 
			parent[yRoot] = xRoot;
			size[xRoot] += size[yRoot];
		} else if(rank[xRoot] < rank[yRoot]) {
			parent[xRoot] = yRoot;
			size[yRoot] += size[xRoot];
		} else if (xRoot != yRoot){
			parent[yRoot] = xRoot;
			size[xRoot] += size[yRoot];
			rank[xRoot]++; 
		}
	}
	
	public int find(int i) {
		if (i != parent[i]) {
			parent[i] = find(parent[i]);
		}
		return parent[i];
	}
	
	public boolean same(int x, int y) {
		return find(x) == find(y);
	}

	public int size(int x) {
		return size[find(x)];
	}

	public int nowSize(int x){
		return size[x];
	}
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
