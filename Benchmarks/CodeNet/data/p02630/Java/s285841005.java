

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int [] baprr = new int[100000];
        Arrays.fill(baprr,0);
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            baprr[arr[i]-1]++;
        }
        int q =s.nextInt();
        int b,c;
        long sum;
        while(q-->0){
            sum=0;
            b=s.nextInt();
            c=s.nextInt();
            baprr[c-1]+=baprr[b-1];
            baprr[b-1]=0;
            for(int i=0;i<100000;i++){
                sum+=((i+1)*baprr[i]);
            }
            System.out.println(sum);
        }
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