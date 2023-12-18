import java.io.*;
import java.util.*;
import static java.lang.Math.min;
import static java.lang.Math.max;
public class Main {
    static List<Pair> al = new ArrayList<>();
    static Pair pred[][]; static int arr[][]; static int n,m;
    static boolean vis[][];
    private static void bfs(int x, int y){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x,y));
        pred[x][y] = new Pair(-1,-1);
        while(q.size() > 0){
            Pair p = q.poll();
            vis[p.x][p.y] = true;
             x = p.x;  y = p.y;
           // System.out.println(p.x+" "+p.y);
            if(x-1 >=0 && arr[x-1][y]==0 && !vis[x-1][y]) {
                q.add(new Pair(x - 1, y));
                vis[x-1][y] = true;
                pred[x-1][y] = p;
            }
            if(y-1 >= 0 && arr[x][y-1]==0 && !vis[x][y-1]) {
                q.add(new Pair(x, y - 1));
                vis[x][y-1] = true;
                pred[x][y-1] = p;
            }
            if(x+1 < n && arr[x+1][y]==0 && !vis[x+1][y]) {
                q.add(new Pair(x + 1, y));
                vis[x+1][y] = true;
                pred[x+1][y] = p;
            }
            if(y+1 < m && arr[x][y+1]==0 && !vis[x][y+1]) {
                q.add(new Pair(x, y + 1));
                vis[x][y+1] = true;
                pred[x][y+1] = p;
            }
        }
    }
    private static void solver(InputReader sc, PrintWriter out) throws Exception {
       n = sc.nextInt();
       m = sc.nextInt();
      int k = sc.nextInt();
      int x1 = sc.nextInt()-1;
      int y1 = sc.nextInt()-1;
      int x2 = sc.nextInt()-1;
      int y2 = sc.nextInt()-1;
       arr = new int[n][m];
      pred = new Pair[n][m];
      vis = new boolean[n][m];
      for(int i=0; i<n; i++){
          String s = sc.next();
          for(int j=0; j<m; j++){
              if(s.charAt(j)=='.')arr[i][j] = 0;
              else arr[i][j] = 1;
          }
      }
      bfs(x1,y1);
      if(pred[x2][y2]==null){
          out.println(-1); return;
      }
      /*for(int i=0; i<n; i++){
          for(int j=0; j<m; j++){
              if(pred[i][j]==null){out.print("   "); continue;}
              out.print((pred[i][j].x+""+pred[i][j].y)+" ");
          }
          out.println();
      }*/
        while(true){
          //  out.println(x2+" "+y2);
            al.add(new Pair(x2,y2));
            int temp = x2;
            x2 = pred[x2][y2].x;
            if(x2==-1) break;
            y2 = pred[temp][y2].y;
        }
      int finans=0;
      for(int i=al.size()-1; i>=0; ){
          int j1=i-1,j2=i-1;
          int count=0;
          for(;j1>=0 && count < k;j1--){
              if(al.get(j1).x==al.get(i).x)count++;
              else break;
          }
          count=0;
          for(;j2>=0 && count < k;j2--){
              if(al.get(j2).x==al.get(i).x)count++;
              else break;
          }
          i = Math.min(j1,j2);
          finans++;
      }
      out.println(finans);
    }
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver(in,out);
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
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}
class Pair implements Comparable<Pair>{
    int x,y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(Pair p){
        return (int)(this.x - p.x);
    }

}