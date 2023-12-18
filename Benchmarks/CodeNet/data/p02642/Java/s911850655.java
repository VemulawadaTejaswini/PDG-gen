import java.io.*;
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

    static boolean div(long val,HashMap<Long,List<Integer>> map)
    {
        if(map.containsKey(1L))
            return false;
        if(map.containsKey(val) &&  map.get(val).size()>1)
        {
            return false;
        }
        for(long i=2;i<=Math.sqrt(val);i++)
        {
            if(val%i==0)
            {
                long j=val/i;
                if(map.containsKey(i) || map.containsKey(j))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        StringBuilder ans = new StringBuilder();
//        int t=ri();
        int t=1;
        while (t-- > 0)
        {
            int n=ri();
            List<Long> list=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                list.add(rl());
            }


            HashMap<Long,List<Integer>> map=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                if(map.containsKey(list.get(i)))
                {
                    map.get(list.get(i)).add(i);
                }
                else
                {
                    List<Integer> mid=new ArrayList<>();
                    mid.add(i);
                    map.put(list.get(i),mid);
                }
            }
            int count=0;
            boolean[] res=new boolean[n];
            for(int j=0;j<n;j++)
            {
                if(div(list.get(j),map))
                {
                    count++;
                }


            }
            ans.append(count).append("\n");
        }
        out.print(ans.toString());
        out.flush();

    }
}
//9999991
