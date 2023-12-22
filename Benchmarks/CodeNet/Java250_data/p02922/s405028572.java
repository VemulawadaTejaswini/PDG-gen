
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static FScanner sc;
    public static PrintWriter out;
    public static void main(String[] args) {
        sc=new FScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));

        int a = sc.nextInt();
        int b = sc.nextInt();
        int oneSocket = 1;
        int ans = 0;
        while(oneSocket < b){
            oneSocket += a - 1;
            ans++;
        }
        System.out.println(ans);



        out.close();

    }

    public static class FScanner {
    BufferedReader br;
    StringTokenizer st;

    public FScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
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