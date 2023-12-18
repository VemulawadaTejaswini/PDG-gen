import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        FastScanner sc = new FastScanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        int[] A = sc.nextIntArray(N);
        int[] set = new int[1000001];
        for(int i=0;i<N;i++){
            set[A[i]]++;
        }
        
        for(int i=0;i<N;i++){
            List<Integer> kp = divisorX(A[i]);
            int c = 0;
            for(int num:kp){
                if(num==A[i]){
                    if(set[num]>1){
                        break;
                    }
                }else{
                    if(set[num]>0){
                        break;
                    }
                }
                
                c++;
            }
            if(c==kp.size()){
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static List<Integer> divisorX(final int n) {
        final List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i); // a x b
                if (i != n / i) {
                    list.add(n / i); // b x a
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        new Main();
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

    public ArrayList<Integer> nextIntList(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++)
            a.add(nextInt());
        return a;
    }

    public ArrayList<Long> nextLongList(int n) {
        ArrayList<Long> a = new ArrayList<Long>(n);
        for (int i = 0; i < n; i++)
            a.add(nextLong());
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