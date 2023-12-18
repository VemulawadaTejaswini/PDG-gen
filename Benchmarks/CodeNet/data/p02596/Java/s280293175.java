import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

/*
1
4
0011
 */
public class Main {

    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        long n=fs.nextInt();
        long ans=0;
        if (n % 2 == 0 || n % 5 == 0) {
            ans = -1;
            System.out.println(ans);
            return;
        }
        long count = 1;
        long num = 7;
        while (num % n != 0) {
            count++;
            num = (10 * num + 7) % n;
            if (count > (long)1e6) {
                ans = -1;
                break;
            }
        }
        System.out.println(ans);



        

    }

    static final Random random=new Random();

    static void ruffleSort(int[] a) {
        int n=a.length;//shuffle, then sort
        for (int i=0; i<n; i++) {
            int oi=random.nextInt(n), temp=a[oi];
            a[oi]=a[i]; a[i]=temp;
        }
        Arrays.sort(a);
    }

    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] nextArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }


}