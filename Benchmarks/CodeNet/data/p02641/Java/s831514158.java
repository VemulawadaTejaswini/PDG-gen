import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
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
        int x = obj.nextInt(),n = obj.nextInt(),arr[] = new int[110],las = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            int k = obj.nextInt();
            las = Math.max(las,k);
            arr[k]++;
        }
        int min = Integer.MAX_VALUE,val=0;
        if(n==0){System.out.print(x);return;}
        int left = x-1,right=x+1;
        while(right<=100)
        {
            if(min>Math.abs(right-x) && arr[right]==0)
            {
                min = Math.abs(right-x);
                val = right;
            }
            right++;
        }
        while(left>=0)
        {
            if(min>=Math.abs(left-x) && arr[left]==0)
            {
                min = Math.abs(left-x);
                val = left;
            }
            left--;
        }
        System.out.print(val);
    }
}
