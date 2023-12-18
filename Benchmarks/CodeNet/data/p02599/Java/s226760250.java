import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = sc.nextIntArray(n);
        ArrayList<Query> li = new ArrayList<>();
        for(int i = 0; i < q; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            li.add(new Query(i,l,r));
        }
        int[] ans = new int[q];
        Collections.sort(li);
        BIT bit = new BIT(n);
        int r = 1;
        int[] lastAppeared = new int[n];
        for(Query Q : li){
            int rmax = Q.r;
            for(int j = r; j <= rmax; j++){
                int rv = a[j-1];
                int prev = lastAppeared[rv];
                if(prev != 0){
                    bit.add(prev,-1);
                }
                lastAppeared[rv] = j; 
                bit.add(lastAppeared[rv],1);
                
            }
            r = rmax;
            ans[Q.i] = bit.sum(Q.l,Q.r+1);
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

class Query implements Comparable<Query>{
    int i,l,r;
    public Query(int i, int l, int r){
        this.i = i;
        this.l = l;
        this.r = r;
    }
    
    public int compareTo(Query q){
        if(this.r < q.r){
            return -1;
        }else if(this.r > q.r){
            return 1;
        }else if(this.l < q.l){
            return -1;
        }else if(this.l > q.l){
            return 1;
        }else{
            return 0;
        }
    }
}

class BIT{
    int uSum = 0;
    int[] dat;
    
    public BIT(int n){
        this.dat = new int[n+1];
        this.uSum = n;
    }
    
    public void add(int a, int x){
        for (int i = a; i < dat.length; i += i & -i){
            dat[i] = dat[i] + x;
        }
        return;
    }
    
    public int sum(int a){
        int res = uSum;
        for (int i = a; i > 0; i -= i & -i)
            res = res + dat[i];
        return res;
    }
    
    public int sum(int a, int b) {
        return sum(b - 1) - sum(a - 1);
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
