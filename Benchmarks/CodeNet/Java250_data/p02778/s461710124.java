import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

 class Main {
    public static void main(String[] args) {
        FastReader f = new FastReader();
        String s=is(f);
        int l = s.length();
        for(int i=0; i<l; ++i){
        	print("x");
		}
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
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
    }

    static int ii(FastReader fr) {
        return fr.nextInt();
    }

    static long il(FastReader fr) {
        return fr.nextLong();
    }

    static double id(FastReader fr) {
        return fr.nextDouble();
    }

    static String is(FastReader fr) {
        return fr.nextLine();
    }

    static void print(Object s) {
        System.out.print(s);
    }

    static void printn(Object s) {
        System.out.println(s);
    }

    static long[] inputArrL(int n, FastReader fr, int idx) {
        long[] arr = new long[n + idx];
        for (int i = idx; i < n + idx; i++)
            arr[i] = fr.nextLong();
        return arr;
    }

    static int[] inputArr(int n, FastReader fr, int idx) {
        int[] arr = new int[n + idx];
        for (int i = idx; i < n + idx; i++)
            arr[i] = fr.nextInt();
        return arr;
    }

    static String[] inputArrS(int n, FastReader fr, int idx) {
        String[] arr = new String[n + idx];
        for (int i = idx; i < n + idx; i++)
            arr[i] = fr.nextLine();
        return arr;
    }

    static int max(int... args) {
        int max = Integer.MIN_VALUE;
        for (int x : args) {
            max = Math.max(x, max);
        }
        return max;
    }

    static int min(int... args) {
        int min = Integer.MAX_VALUE;
        for (int x : args) {
            min = Math.min(x, min);
        }
        return min;
    }

    static long max(long... args) {
        long max = Long.MIN_VALUE;
        for (long x : args) {
            max = Math.max(x, max);
        }
        return max;
    }

    static long min(long... args) {
        long min = Long.MAX_VALUE;
        for (long x : args) {
            min = Math.min(x, min);
        }
        return min;
    }

    static int lenDigit(int d) {
        if (d == 0)
            return 1;
        int l = 0;
        while (d != 0) {
            l++;
            d /= 10;
        }
        return l;
    }

    static void debug(Object... args) {
        for (int i = 0; i < args.length; i += 2) {
            print("[" + args[i] + ":" + args[i + 1] + "]" + " ");
        }
        printn("");
    }

    static int MOD = (int) 1e9 + 7;
}

