import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
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

    static FastReader s = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    private static int[] rai(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    private static int[][] rai(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    private static long[] ral(int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextLong();
        }
        return arr;
    }

    private static long[][] ral(int n, int m) {
        long[][] arr = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextLong();
            }
        }
        return arr;
    }

    private static int ri() {
        return s.nextInt();
    }

    private static long rl() {
        return s.nextLong();
    }

    private static String rs() {
        return s.next();
    }

    public static void main(String[] args) throws IOException {
        StringBuilder ans = new StringBuilder();
//        int t=ri();
        int t=1;
        while (t-- > 0)
        {
            int n=ri();int m=ri();
            long k=rl();
            long[] a=ral(n);
            long[] b=ral(m);

            int i=0,j=0;
            while(i<n && j<m)
            {
                if(a[i]<=b[j])
                {
                    if(a[i]<=k)
                    {
                        k-=a[i];
                        i++;
                    }
                    else {
                        break;
                    }
                }
                else
                {
                    if(b[j]<=k)
                    {
                        k-=b[j];
                        j++;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            while(i<n)
            {
                if(a[i]<=k)
                {
                    k-=a[i];
                    i++;
                }
                else {
                    break;
                }
            }
            while(j<m)
            {
                if(b[j]<=k)
                {
                    k-=b[j];
                    j++;
                }
                else
                {
                    break;
                }
            }
            ans.append((long)i+(long)j).append("\n");
        }
        out.print(ans.toString());
        out.flush();

    }
}
