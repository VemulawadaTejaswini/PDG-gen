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
        PrintWriter pw = new PrintWriter(System.out);
        List<Integer> primeList = primeList(1000000);
        long ans = 0;
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int[] B = new int[1000005];
        //System.err.println(primeList);
        for(int i=0;i<N;i++){
            List<Integer> primeFactor = fastPrimeFactor(A[i], primeList);
            //System.err.println(primeFactor);
            for(int num:primeFactor){
                B[num]++;
            }
        }

        boolean pairwise = true;
        boolean setwise = true;
        for(int i=1;i<=1000000;i++){
            if(B[i]>=2)pairwise=false;
            if(B[i]==N)setwise=false;
        }
        if(pairwise){
            System.out.println("pairwise coprime");
            return;
        }

        if(setwise){
            System.out.println("setwise coprime");
            return;
        }

        
        System.out.println("not coprime");
        return;
    }

    public static List<Integer> primeList(int max) {
        final List<Integer> prime = new ArrayList<Integer>();
        prime.add(2);
        for (int i = 3; i <= max; i += 2) {
            for (int wari : prime) {
                if (i % wari == 0)
                    break;
                if (wari * wari > i) {
                    prime.add(i);
                    break;
                }
            }
        }
        return prime;
    }

    public static List<Integer> fastPrimeFactor(int n, List<Integer> prime) {
        final List<Integer> list = new ArrayList<Integer>();
        if (n < 2) {
            return list;
        }

        for (int num : prime) {
            boolean first = true;
            while (n % num == 0) {
                if(first)list.add(num);
                //list.add(n);
                first=false;
                n /= num;
            }
            if (num * num > n)
                break;
        }

        if (n != 1) {
            list.add(n);
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