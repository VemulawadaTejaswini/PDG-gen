import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Long> bomb = new HashSet<>();
        RC[] row = new RC[h];
        RC[] column = new RC[w];
        for(int i = 0; i < h; i++){
            row[i] = new RC(i,0);
        }
        for(int i = 0; i < w; i++){
            column[i] = new RC(i,0);
        }
        int max = 0;
        for(int i = 0; i < m; i++){
            int y = sc.nextInt()-1;
            int x = sc.nextInt()-1;
            row[y].cnt++;
            column[x].cnt++;
            bomb.add((long)y*w+(long)x);
        }
        Arrays.sort(row);
        Arrays.sort(column);
        int maxR = row[0].cnt;
        int maxC = column[0].cnt;
        long rcnt = 0;
        for(RC r : row){
            if(r.cnt != maxR) break;
            rcnt++;
        }
        boolean flg = false;
        for(RC c : column){
            if(c.cnt != maxC) break;
            for(int i = 0; i < rcnt; i++){
                if(!bomb.contains((long)row[i].cnt*w+c.cnt)){
                    flg = true;
                    break;
                }
            }
        }
        if(flg){
            pw.println(maxR + maxC);
        }else{
            pw.println(maxR + maxC-1);
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

class RC implements Comparable<RC>{
    int index,cnt;
    public RC(int index, int cnt){
        this.index = index;
        this.cnt = cnt;
    }
    
    public int compareTo(RC r){
        if(this.cnt > r.cnt){
            return -1;
        }else if(this.cnt < r.cnt){
            return 1;
        }else{
            return 0;
        }
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
