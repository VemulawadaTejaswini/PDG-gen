import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        HashMap<Long,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        ArrayList<Long> arr = new ArrayList<>();
        long cl = 0;
        for(int i = 0; i < n; i++){
            String[] s = sc.next().split("\\.");
            if(s.length == 1){
                long k = Integer.parseInt(s[0])*10000;
                map.put(k,map.getOrDefault(k,0)+1);
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
                    long k = Integer.parseInt(s[0])*10000;
                    map.put(k,map.getOrDefault(k,0)+1);
                    cl++;
                }else if(last >= 4){
                    continue;
                }else{
                    long k = Integer.parseInt(s[0])*10000 + (int)rep2(10,4-last)*Integer.parseInt(s[1].substring(0,last));
                    long k2 = k%10000;
                    map.put(k,map.getOrDefault(k,0)+1);
                    arr.add(k2);
                }
            }
        }
        long ans = cl*(cl-1)/2L;
        for(long a : arr){
            long now = 10000;
            boolean flg = false;
            for(int i = 0; i < 5; i++){
                if(now % a != 0){
                    now *= 10;
                }else{
                    flg = true;
                    now *= now / a;
                    int pow = i*2;
                    while(pow > 0){
                        now /= 10;
                        pow--;
                    }
                    break;
                }
            }
            if(!flg){
                now = 10000;
                for(int i = 0; i < 5; i++){
                    if(a % 10000 != 0){
                        a *= 10;
                        now *= 10;
                    }else{
                        break;
                    }
                }
            }
            for(long i = 1; i <= 1000; i++){
                ans += map.getOrDefault(now*i,0);
            }
        }
        pw.println(ans);
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
