




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int c=0;
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



    public static void main(String[] args)throws IOException {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int k=fr.nextInt();
        int arr[] =new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = fr.nextInt();
        }
        int sums[]=new int[n];
        Arrays.fill(sums,Integer.MAX_VALUE);
        sums[0]=0;
        sums[1]=Math.abs(arr[1]-arr[0]);
        for(int i=0;i<n;i++)
        {
            int j=i+1;
            int c=1;
            while(j<n&&c<=k)
            {
                sums[j]=Math.min(sums[i]+Math.abs(arr[j]-arr[i]),sums[j]);
                j++;
                c++;
            }
        }
        System.out.println(sums[n-1]);


    }




}
