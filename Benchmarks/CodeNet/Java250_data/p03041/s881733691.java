import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int N = fr.nextInt(), K = fr.nextInt();
        String S = fr.next();
        S = S.substring(0, K-1) + (char) (S.charAt(K-1) - 'A' + 'a') + S.substring(K);
        System.out.println(S);
    }
}

class FastReader {

    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException  e) {
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