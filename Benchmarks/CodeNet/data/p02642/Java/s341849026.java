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

    static boolean isPrime(int val)
    {
        int flag=0;
        for(int i=2;i<=Math.sqrt(val);i++)
        {
            if(val%i==0)
            {
                flag=1;
                break;
            }
        }
        return flag==0;
    }
    public static void main(String[] args) throws IOException {
        StringBuilder ans = new StringBuilder();
//        int t=ri();
        int t=1;
        while (t-- > 0)
        {
            int n=ri();
            List<Long> list=new ArrayList<>();
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++)
            {
                list.add(rl());
                set.add(i);
            }

//            Collections.sort(list);
            long max=Integer.MIN_VALUE;
            HashMap<Long,List<Integer>> map=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                max=Math.max(max,list.get(i));
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
            boolean[] res=new boolean[n];
            for(int j=0;j<n;j++)
            {
                long i=list.get(j);
                long mul=1;
                int flag=0;
                while(i*mul<=max)
                {
                    long val=i*mul;
                    if(map.containsKey(val))
                    {
                        for(int v:map.get(val))
                        {
                            if(v!=j)
                            {
                                set.remove(v);
                            }
                        }
                    }
                    mul++;
                }

            }
            ans.append(set.size()).append("\n");
        }
        out.print(ans.toString());
        out.flush();

    }
}
//9999991
