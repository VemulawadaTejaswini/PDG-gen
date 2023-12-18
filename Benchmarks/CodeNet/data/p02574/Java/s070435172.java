import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader sc = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0 ; i<n ; i++) {
                a[i] = sc.nextInt();
            }

            int gcd = 0;
            for(int i=0 ; i<n ; i++) {
                gcd = gcd(gcd, a[i]);
            }

            if(gcd == 1) {
                int m = 1_000_000;
                int[] lf = lf(m);
                boolean[] pres = new boolean[m+1];
                boolean pc = true;
                for(int i=0 ; i<n ; i++) {
                    int x = a[i];
                    TreeSet<Integer> ts = new TreeSet<>();
                    while(x != 1) {
                        int elem = lf[x];
                        ts.add(elem);
                        x /= lf[x];
                    }
                    for(int elem: ts) {
                        if(pres[elem]) {
                            pc = false;
                            break;
                        }
                        else {
                            pres[elem] = true;
                        }
                    }
                }

                if(pc) {
                    pw.println("pairwise coprime");
                }
                else {
                    pw.println("setwise coprime");
                }
            }
            else {
                pw.println("not coprime");
            }
        }
        finally {
            pw.flush();
            pw.close();
        }
    }

    static int[] lf(int n) {
        int[] lf = new int[n+1];
        for(int i=1 ; i<=n ; i++) {
            lf[i] = i;
        }
        for(int i=2 ; i<=n ; i++) {
            if(lf[i] == i) {
                for(int j=2*i ; j<=n ; j+=i) {
                    if(lf[j] == j) {
                        lf[j] = i;
                    }
                }
            }
        }
        return lf;
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a%b);
    }
    
    static class Reader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while(!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException io) {
                    io.printStackTrace();
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
    }
}
