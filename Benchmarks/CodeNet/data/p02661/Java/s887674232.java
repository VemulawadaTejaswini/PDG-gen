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
import java.util.AbstractMap.SimpleEntry;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        FastScanner sc = new FastScanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        ArrayList<Integer> aList = new ArrayList<Integer>(N);
        ArrayList<Integer> bList = new ArrayList<Integer>(N);
        ArrayList<SimpleEntry<Integer, Boolean>> sum = new ArrayList<SimpleEntry<Integer, Boolean>>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            A[i] = a;
            aList.add(a);
            B[i] = b;
            bList.add(b);
            sum.add(new SimpleEntry<Integer, Boolean>(a, true));
            sum.add(new SimpleEntry<Integer, Boolean>(b, false));
        }
        Collections.sort(aList);
        Collections.sort(bList);
        Collections.sort(sum, Comparator.comparing(SimpleEntry<Integer, Boolean>::getKey));
        if (N % 2 == 1) {
            int mid = N / 2;
            int start = aList.get(mid);
            int end = bList.get(mid);
            // System.err.println(end-start+1);
            int cnt = 0;
            int sp = INF;
            int ep = 0;
            boolean in = false;
            for (int i = 0; i < 2 * N; i++) {
                int num = sum.get(i).getKey();
                if (sum.get(i).getValue()) {
                    cnt++;
                    if (cnt == 1) {
                        sp = num;
                    }
                } else {
                    cnt--;
                    if (cnt == 0) {
                        ep = num;
                        ans += Math.max(0, Math.min(ep, end) - Math.max(sp, start)+1);
                    }
                }
            }
            System.out.println(ans);
        }else{                      
            int mid = N / 2-1;
            int start1 = aList.get(mid);
            int start2 = aList.get(mid+1);
            int end1 = bList.get(mid);
            int end2 = bList.get(mid+1);

            int start = start1;
            int end = end2;

            int cnt = 0;
            int sp = INF;
            int ep = 0;
            boolean in = false;
            for (int i = 0; i < 2 * N; i++) {
                int num = sum.get(i).getKey();
                if (sum.get(i).getValue()) {
                    cnt++;
                    if (cnt == 1) {
                        sp = num;
                    }
                } else {
                    cnt--;
                    if (cnt == 0) {
                        ep = num;
                        ans += Math.max(0, Math.min(ep, end) - Math.max(sp, start)+1);
                    }
                }
            }
            ans--;
            System.out.println(ans);
            /*
            int ssc = 0;            
            for (int i = 0; i < 2 * N; i++) {
                int num = sum.get(i).getKey();
                if (sum.get(i).getValue()) {
                    cnt++;
                    if (cnt == 1) {
                        sp = num;
                    }
                } else {
                    cnt--;
                    if (cnt == 0) {
                        ep = num;
                        ssc += Math.max(0, Math.min(ep, start2) - Math.max(sp, start1)+1);
                    }
                }
            }
            ssc--;

            
            int eec = 0;            
            for (int i = 0; i < 2 * N; i++) {
                int num = sum.get(i).getKey();
                if (sum.get(i).getValue()) {
                    cnt++;
                    if (cnt == 1) {
                        sp = num;
                    }
                } else {
                    cnt--;
                    if (cnt == 0) {
                        ep = num;
                        eec += Math.max(0, Math.min(ep, end2) - Math.max(sp, end1)+1);
                    }
                }
            }
            eec--;

            int iic = 0;            
            for (int i = 0; i < 2 * N; i++) {
                int num = sum.get(i).getKey();
                if (sum.get(i).getValue()) {
                    cnt++;
                    if (cnt == 1) {
                        sp = num;
                    }
                } else {
                    cnt--;
                    if (cnt == 0) {
                        ep = num;
                        iic += Math.max(0, Math.min(ep, end1) - Math.max(sp, start2)+1);
                    }
                }
            }

            ans = 
            System.out.println(ans);
            */
        }
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