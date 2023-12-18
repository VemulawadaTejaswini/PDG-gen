import java.io.*;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final FastReader s=new FastReader();
        int r = s.nextInt();
        int c = s.nextInt();
        int k = s.nextInt();
        
        Set<Integer> validRows = new HashSet<>();
        int[][] map = new int[r+1][c+1];
        for(int i=0; i<k; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            map[x][y] = s.nextInt();
            if(!validRows.contains(x))
                validRows.add(x);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int vr : validRows) {
            int sum = 0;
            for(int i=0; i<c; i++) {
                sum+=map[vr][i];
                pq.add(map[vr][i]);
                if(pq.size()>3){
                    sum -= pq.poll();
                }
                map[vr][i] = sum;
            }
        }

        int[][] dp = new int[r+1][c+1];
        for(int i=1; i<=r; i++) {
            int sum = 0;
            pq.clear();
            for(int j=1; j<=c; j++) {
                if(validRows.contains(i)){
                    sum+=map[i][j];
                    pq.add(map[i][j]);
                    if(pq.size()>3){
                        sum -= pq.poll();
                    }
                    //map[i][j] = sum;
                }
                
                dp[i][j] = Math.max(dp[i-1][j] + map[i][j], sum);
                System.out.println(i+ " " + j+ " "+ map[i][j]+" "+dp[i][j]);
            }
        }
        System.out.println(dp[r][c]);
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