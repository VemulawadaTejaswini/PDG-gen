import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int[][] cnt = new int[(int)1e4+1][(int)1e4+1];
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        //arrayList<int[]> arr = new ArrayList<>();
        /*
        for(int i = 0; i < n; i++){
            arr.add(new int[(int)1e4+1]);        
        }
        */
        long cl = 0;
        for(int i = 0; i < n; i++){
            String[] s = sc.next().split("\\.");
            if(s.length == 1){
                int k = Integer.parseInt(s[0]);
                cnt[k][0]++;
                cl++;
            }else{
                int last = s[1].length();
                for(int j = s[1].length()-1; j >= 0; j--){
                    if(s[1].charAt(j) == '0'){
                        last = j;
                    }else{
                        break;
                    }
                }
                if(last == 0){
                    int k = Integer.parseInt(s[0]);
                    cnt[k][0]++;
                    cl++;
                }else if(last >= 5){
                    continue;
                }else{
                    int k = Integer.parseInt(s[0]);
                    int k2 = (int)rep2(10,4-last)*Integer.parseInt(s[1].substring(0,last));
                    //System.out.println(k2);
                    arr.add(k2);
                    cnt[k][k2]++;
                }
            }
        }
        long ans = cl*(cl-1)/2L;
        long ans2 = 0;
        //pw.println(ans);
        int max = (int)1e8;
        for(int a : arr){
            if(max % a != 0) continue;
            int s = 10000/a;
            int smax = max/a;
            for(int i = s; i <= smax; i++){
                int k = a*i;
                int k1 = k/10000;
                int k2 = k%10000;
                ans2 += cnt[k1][k2];
            }
        }
        pw.println(ans+ans2/2);
        pw.flush();
    }
    
    private static long rep2(long b, long n){
        if(n == 0) return 1;
        if(n == 1) return b;
        long bn = rep2(b,n/2);
        if(n % 2 == 0){
            return bn*bn;
        }else{
            return bn*bn*b;
        }
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
