import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader sc = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = 1;
            long moves = 0;
            for(int i=0 ; i<n ; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(l <= m) {
                    if(l >= a && l <= b) {
                        moves += b-l+1;
                        l = b+1;
                    }
                    moves++;
                    if(l <= m) {
                        pw.println(moves);
                    }
                    else {
                        pw.println(-1);
                    }
                }
                else {
                    pw.println(-1);
                }
            }
        }
        finally {
            pw.flush();
            pw.close();
        }
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
