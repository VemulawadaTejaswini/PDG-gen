

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int m = s.nextInt();
        long k = s.nextLong();
        long [] arr =new long[n];
        long [] brr = new long[m];
        long [] prearr =new long[n];
        long [] prebrr = new long[m];
        for(int i=0;i<n;i++)
            arr[i]=s.nextLong();
        prearr[0]=arr[0];
        for(int i=1;i<n;i++)
            prearr[i]+=(arr[i]+prearr[i-1]);
        for(int i=0;i<m;i++)
            brr[i]=s.nextLong();
        prebrr[0]=brr[0];
        for(int i=1;i<m;i++)
            prebrr[i]+=(brr[i]+prebrr[i-1]);
        long res =0;
        long max=0;
        long temp;
        int flag=0;
        for(int j=0;j<m;j++){
            if(k<prebrr[j]){
                max+=j;
                flag=1;
                break;
            }
        }
        if(flag==0)
            max=m;

        for(int i=0;i<n;i++){
            res=i+1;
            temp=k-prearr[i];
            if(temp<0)
                break;
            res+=(binary_search(prebrr,0,m-1,temp)+1);
            if(max<res)
                max=res;
        }
        System.out.println(max);
    }

    private static int binary_search(
            long arr[], int l,
            int h, long x)
    {
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] <= x)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return h;
    }

    private static boolean isPrime(int n) {
        if (n == 2)
            return true;
        else if ((n % 2 == 0 && n > 2) || n < 2)
            return false;
        else {
            for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
                if (n % i == 0)
                    return false;
            }
            return true;
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

}