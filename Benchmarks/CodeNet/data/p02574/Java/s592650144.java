import java.util.*;
import java.io.*;
 
public class Main {
    static ArrayList<ArrayList<Integer>> map;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[] arr = sc.nextIntArray(n);
        Sieve s = new Sieve((int)1e6+1);
        boolean isPc = true;
        boolean isSc = false;
        long gcd = arr[0];
        long now = arr[0];
        for(int i = 1; i < n; i++){
            now = gcd(now,arr[i]);
            if(now == 1){
                isSc = true;
                break;
            }
        }
        HashSet<Integer> key = new HashSet<>();
        for(int i = n-1; i >= 0; i--){
            HashMap<Integer,Integer> tmp = s.factor(arr[i]);
            for(Map.Entry<Integer,Integer> e : tmp.entrySet()){
                if(key.contains(e.getKey())){
                    isPc = false;
                    break;
                }else{
                    key.add(e.getKey());
                }
            }
            if(!isPc) break;
        }
        if(isPc){
            pw.println("pairwise coprime");
        }else{
            pw.println(isSc ? "setwise coprime" : "not coprime");
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
    
    private static long gcd(long a, long b)
    {
        while (b > 0)
        {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
    
    private static long gcd(long[] input)
    {
        long result = input[0];
        for(int i = 1; i < input.length; i++)
        {
            result = gcd(result, input[i]);
        }
        return result;
    }
    
    private static long lcm(long a, long b)
    {
        return a * (b / gcd(a, b));
    }
    
    private static long lcm(long[] input)
    {
        long result = input[0];
        for(int i = 1; i < input.length; i++)
        {
            result = lcm(result, input[i]);
        }
        return result;
    }

}


class Sieve{
    static int n;
    static int[] f;
    static ArrayList<Integer> prime;
    public Sieve(int n){
        long ln = n;
        prime = new ArrayList<Integer>();
        f = new int[n+1];
        f[0] = f[1] = -1;
        for(int i = 2; i <= n; i++){
            if(f[i] != 0){
                continue;
            }
            f[i] = i;
            prime.add(i);
            long li = (long)i;
            for(long j = li*li; j <= ln; j += li){
                if(f[(int)j] == 0){
                    f[(int)j] = i;
                }
            }
        }
    }
    
    public static boolean isPrime(int x){
        return f[x] == x;
    }
    
    public static ArrayList<Integer> factorList(int x){
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(x != 1){
            res.add(f[x]);
            x /= f[x];
        }
        return res;
    }
    
    public static HashMap<Integer,Integer> factor(int x){
        ArrayList<Integer> fl = factorList(x);
        HashMap<Integer,Integer> res = new HashMap<Integer,Integer>();
        if(fl.size()==0){
            return new HashMap<Integer,Integer>();
        }
        int prev = fl.get(0);
        int cnt = 0;
        for(int p : fl){
            if(prev == p){
                cnt++;
            }else{
                res.put(prev,cnt);
                prev = p;
                cnt = 1;
            }
        }
        res.put(prev,cnt);
        return res;
    }
    
    public static int getF(int x){
        if(x == 1) return -1;
        return f[x];
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
