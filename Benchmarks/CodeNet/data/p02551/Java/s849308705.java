//package atcoder.beginner179;

import java.io.*;
import java.util.*;

public class Main {
    static InputReader in;
    static PrintWriter out;

    public static void main(String[] args) {
        //initReaderPrinter(true);
        initReaderPrinter(false);
        //solve(in.nextInt());
        solve(1);
    }

    static void solve(int testCnt) {
        for (int testNumber = 0; testNumber < testCnt; testNumber++) {
            int n = in.nextInt();
            int q = in.nextInt();
            long total = ((long)(n - 2)) * (n - 2);
            TreeSet<int[]> ts1 = new TreeSet<>(Comparator.comparingInt(a->a[1])), ts2 = new TreeSet<>(Comparator.comparingInt(a->a[1]));
            ts1.add(new int[]{2, n-1, n});
            ts2.add(new int[]{2, n-1, n});
            int min1 = n, min2 = n;

            for(int i = 0;i < q; i++) {
                int t = in.nextInt();
                int x = in.nextInt();

                if(t == 1) {
                    int[] curr = ts1.ceiling(new int[]{x,x,0});
                    total -= (curr[2] - 1 - 1);
                    if(x < min1) {
                        //update for type2 operation
                        int[] head = ts2.pollFirst();
                        if(2 <= min2 - 1) {
                            ts2.add(new int[]{2, min2 - 1, x});
                        }
                        if(min2 + 1 <= head[1]) {
                            ts2.add(new int[]{min2 + 1, head[1], head[2]});
                        }
                        min1 = x;
                    }
                }
                else {
                    int[] curr = ts2.ceiling(new int[]{x,x,0});
                    total -= (curr[2] - 1 - 1);
                    if(x < min2) {
                        //update for type1 operation
                        int[] head = ts1.pollFirst();
                        if(2 <= min1 - 1) {
                            ts1.add(new int[]{2, min1 - 1, x});
                        }
                        if(min1 + 1 <= head[1]) {
                            ts1.add(new int[]{min1 + 1, head[1], head[2]});
                        }
                        min2 = x;
                    }
                }
            }
            out.println(total);
        }
        out.close();
    }

    static void initReaderPrinter(boolean test) {
        if (test) {
            try {
                in = new InputReader(new FileInputStream("src/input.in"));
                out = new PrintWriter(new FileOutputStream("src/output.out"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            in = new InputReader(System.in);
            out = new PrintWriter(System.out);
        }
    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        InputReader(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream), 32768);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        Integer[] nextIntArray(int n) {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        Long[] nextLongArray(int n) {
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }
    }
}


