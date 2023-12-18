import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main
{
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
    public static void main(String args[])
    {
        FastReader obj = new FastReader();
        int n = obj.nextInt(),max = Integer.MIN_VALUE;
        ArrayList<Integer> data = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int k = obj.nextInt();
            data.add(k);
            max = Math.max(max,k);
        }
        boolean bool[] = new boolean[max+1];
        for(int i=0;i<n;i++)
        {
            int l = data.get(i);
            if(!bool[l])
            {
                for(int j=2*l;j<=max;j=j+l)
                    bool[j] = true;
            }
        }
        int count = 0;
        TreeSet<Integer> d = new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            if(!bool[data.get(i)] && !d.contains(data.get(i)))
            {
                d.add(data.get(i));
                count++;
            }
        }
        System.out.println(count==1?0:count);
    }
}
