import java.io.*;
import java.util.*;

public class Main {
    static char[][] arr;
    static boolean visited[][];
    static int n, m;
    static int dp[][];
    private  static void bfs(int x, int y){
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[x][y] = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x, y));
        while(q.size() > 0){
            Pair cur = q.poll();
            visited[cur.x][cur.y] = true;
            int[]point = {-1, -2,+1, +2};
            for(int xx1 : point){
                int xx = cur.x + xx1;
                for(int yy1 : point){
                    int yy = cur.y + yy1;
                    if(xx1==-1 && yy1==1){
                        if(isValid(xx, yy)){
                            q.add(new Pair(xx, yy));
                            dp[xx][yy] = Math.min(dp[xx][yy], dp[cur.x][cur.y]);
                            visited[xx][yy] = true;
                        }
                    }else if(xx1==-1 && yy1==-1){
                        if(isValid(xx, yy)){
                            q.add(new Pair(xx, yy));
                            dp[xx][yy] = Math.min(dp[xx][yy], dp[cur.x][cur.y]);
                            visited[xx][yy] = true;
                        }
                    }else if(xx1==1 && yy1==-1){
                        if(isValid(xx, yy)){
                            q.add(new Pair(xx, yy));
                            dp[xx][yy] = Math.min(dp[xx][yy], dp[cur.x][cur.y]);
                            visited[xx][yy] = true;
                        }
                    }else if(xx1==1 && yy1==1){
                        if(isValid(xx, yy)){
                            q.add(new Pair(xx, yy));
                            dp[xx][yy] = Math.min(dp[xx][yy], dp[cur.x][cur.y]);
                            visited[xx][yy] = true;
                        }
                    }
                    else{
                        if(isValid(xx, yy)){
                            q.add(new Pair(xx, yy));
                            dp[xx][yy] = Math.min(dp[xx][yy], dp[cur.x][cur.y] + 1);
                            visited[xx][yy] = true;
                        }
                    }
                }
            }
         }
    }
    private static boolean isValid(int x, int y){
      //  System.out.println(x+" "+y);
        if(x >=n || x <0 || y >=m || y<0 || arr[x][y]=='#' || visited[x][y]) return false;
        return true;
    }
    private static void solve(InputReader sc, PrintWriter out) throws Exception {
        n = sc.nextInt();
        m = sc.nextInt();
        int ch = sc.nextInt();
        int cw = sc.nextInt();
        int dh = sc.nextInt();
        int dw = sc.nextInt();
        arr = new char[n][m];
        visited = new boolean[n][m];
        for(int i=0; i<n; i++){
            String s = sc.next();
            arr[i] = s.toCharArray();
        }
        dp = new int[n][m];
        bfs(ch-1, cw-1);
        if(visited[dh-1][dw-1]) out.println(dp[dh-1][dw-1]);
        else out.println(-1);
    }

    public static Set<Integer> seive(int n) {
        boolean[] arr = new boolean[n + 1];
        Set<Integer> hs = new HashSet<>();
        Arrays.fill(arr, true);
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                for (int j = i + i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i]) hs.add(i);
        }
        return hs;
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solve(in, out);
        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
class Pair{
    int x, y;
    Pair(int x, int y){
        this.x = x; this.y = y;
    }
}