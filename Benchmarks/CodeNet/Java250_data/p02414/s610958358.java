import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Objects;

public class Main{
    public static void main(String[] args){
        FastScanner sc = new FastScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        long[][] a = new long[n][m];
        long[][] b = new long[m][l];
        long[][] ans = new long[n][l];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)a[i][j] = sc.nextLong();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<l;j++)b[i][j] = sc.nextLong();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                for(int k=0;k<m;k++)ans[i][j] += a[i][k]*b[k][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<l-1;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println(ans[i][l-1]);
        }
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
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
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}

