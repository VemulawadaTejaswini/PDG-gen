import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[]a= sc.nextIntArr(n);
        Arrays.sort(a);
        int ans =0;
        for (int i =0;i<n;i++){
            for (int j =i+1;j<n;j++)
                if (a[i]!=a[j])
                for (int k =j+1;k<n;k++){
                if (a[i]==a[k]||a[k]==a[j])
                    continue;
                    if (a[i]+a[j]>a[k])
                        ans++;
                }
        }
        pw.println(ans);

        pw.close();

    }



    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(next());
            }
            return arr;
        }

    }

}