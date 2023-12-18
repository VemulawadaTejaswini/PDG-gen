import java.io.*;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final FastReader s=new FastReader();
        String st = s.nextLine();
        int count=0;
        int local = 0;
        for (char c : st.toCharArray()) {
            if(c=='R'){
                    local++;
            } else {
                count = Math.max(count, local);
                local=0;
            }
        }
        count = Math.max(count, local);
        System.out.println(count);
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (final IOException  e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (final IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}