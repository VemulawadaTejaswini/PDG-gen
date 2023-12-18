import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        ArrayList<Long> arr = new ArrayList<>();
        long n = sc.nextLong();
        long x = sc.nextInt();
        long m = sc.nextInt();
        long total = x;
        long ans = 0;
        long now = x;
        long[] appear = new long[(int)m];
        appear[(int)x] = 1;
        arr.add(x);
        boolean isCalc = false;
        for(long i = 2; i <= n; i++){
            now *= now;
            now %= m;
            if(appear[(int)now] != 0){
                long roopTotal = 0;
                long modTotal = 0;
                long roops = (n-i)/(i-appear[(int)now]);
                int mod = (int)((n-i)%(i-appear[(int)now]));
                int cnt = 0;
                for(int j = (int)appear[(int)now]; j < (int)i; j++){
                    roopTotal += arr.get(j-1);
                    if(mod >= cnt){
                        modTotal += arr.get(j-1);
                        cnt++;
                    }
                }
                //pw.println(total + " " + (roops*roopTotal) + " " + modTotal);
                ans = total + roops*roopTotal + modTotal;
                isCalc = true;
                break;
            }else{
                appear[(int)now] = i;
                arr.add(now);
                total += now;
            }
        }
        pw.println(isCalc ? ans : total);
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
