import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] a = sc.nextIntArray(n);
        int[] b = sc.nextIntArray(n);
        int[] ans = new int[n];
        int[] acnt = new int[n+1];
        int[] bcnt = new int[n+1];
        for(int i = 0; i < n; i++){
            acnt[a[i]]++;
        }
        for(int i = 0; i < n; i++){
            bcnt[b[i]]++;
        }
        boolean flg = true;
        for(int i = 1; i <= n; i++){
            if(acnt[i]+bcnt[i] > n){
                flg = false;
                break;
            }
        }
        if(flg){
            pw.println("Yes");
            int i = 0;
            int j = 0;
            while(j < n){
                if(a[i] != b[j]){
                    ans[i] = b[j];
                    j++;
                }
                i++;
                if(i >= n) i -= n;
            }
            for(int v : ans){
                sb.append(v).append(" ");
            }
            pw.println(sb.toString());
        }else{
            pw.println("No");
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

class PointX implements Comparable<PointX>{
    long x,y;
    public PointX(long x, long y){
        this.x = x-y;
        this.y = x+y;
    }
    
    public int compareTo(PointX p){
        if(this.x < p.x){
            return -1;
        }else if(this.x > p.x){
            return 1;
        }else{
           if(this.y < p.y){
               return -1;
           }else if(this.y > p.y){
               return 1;
           }else{
               return 0;
           }
        }
    }
}

class PointY implements Comparable<PointY>{
    long x,y;
    public PointY(long x, long y){
        this.x = y-x;
        this.y = x+y;
    }
    
    public int compareTo(PointY p){
        if(this.x < p.x){
            return -1;
        }else if(this.x > p.x){
            return 1;
        }else{
           if(this.y < p.y){
               return -1;
           }else if(this.y > p.y){
               return 1;
           }else{
               return 0;
           }
        }
    }
}

class PointX2 implements Comparable<PointX2>{
    long x,y;
    public PointX2(long x, long y){
        this.x = x+y;
        this.y = x-y;
    }
    
    public int compareTo(PointX2 p){
        if(this.x < p.x){
            return -1;
        }else if(this.x > p.x){
            return 1;
        }else{
           if(this.y < p.y){
               return -1;
           }else if(this.y > p.y){
               return 1;
           }else{
               return 0;
           }
        }
    }
}

class PointY2 implements Comparable<PointY2>{
    long x,y;
    public PointY2(long x, long y){
        this.x = x+y;
        this.y = y-x;
    }
    
    public int compareTo(PointY2 p){
        if(this.x < p.x){
            return -1;
        }else if(this.x > p.x){
            return 1;
        }else{
           if(this.y < p.y){
               return -1;
           }else if(this.y > p.y){
               return 1;
           }else{
               return 0;
           }
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
