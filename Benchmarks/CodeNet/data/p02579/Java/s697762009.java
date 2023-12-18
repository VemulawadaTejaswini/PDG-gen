
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

   private static final String INPUT_FILE_PATH = "";

   void solve() {
      int h = in.nextInt(), w = in.nextInt();
      int ch = in.nextInt(), cw = in.nextInt();
      ch--; cw--;
      int dh = in.nextInt(), dw = in.nextInt();
      dh--; dw--;
      char[][] s = new char[h][w];
      for (int i = 0; i < h; i++) {
         s[i] = in.nextToken().toCharArray();
      }

      int[][] dist = new int[h][w];
      for (int i = 0; i < h; i++) Arrays.fill(dist[i], -1);
      dist[ch][cw] = 0;

      PriorityQueue<State> pq = new PriorityQueue<>();
      pq.add(new State(0, ch, cw));
      while (!pq.isEmpty()) {
         State top = pq.poll();
         if (top.h == dh && top.w == dw) {
            out.println(top.d);
            return;
         }

         for (int i = Math.max(0, top.h - 1); i <= Math.min(h - 1, top.h + 1); i++) {
            for (int j = Math.max(0, top.w - 1); j <= Math.min(w - 1, top.w + 1); j++) {
               if (i == top.h && j == top.w) continue;
               if (i != top.h && j != top.w) continue;
               if (s[i][j] == '#') continue;
               if (dist[i][j] != -1 && top.d >= dist[i][j]) continue;
               dist[i][j] = top.d;
               pq.add(new State(top.d, i, j));
            }
         }

         for (int i = Math.max(0, top.h - 2); i <= Math.min(h - 1, top.h + 2); i++) {
            for (int j = Math.max(0, top.w - 2); j <= Math.min(w - 1, top.w + 2); j++) {
               if (i == top.h && j == top.w) continue;
               if (s[i][j] == '#') continue;
               if (dist[i][j] != -1 && top.d + 1 >= dist[i][j]) continue;
               dist[i][j] = top.d + 1;
               pq.add(new State(top.d + 1, i, j));
            }
         }

      }

      out.println(-1);
   }

   static class State implements Comparable<State> {
      int d;
      int h;
      int w;

      public State(int d, int h, int w) {
         this.d = d;
         this.h = h;
         this.w = w;
      }

      public int compareTo(State other) {
         return Integer.compare(this.d, other.d);
      }
   }

   private final InputReader in;
   private final PrintWriter out;

   private Main(InputReader in, PrintWriter out) {
      this.in = in;
      this.out = out;
   }

   private static class InputReader {
      private BufferedReader br;
      private StringTokenizer st;

      public InputReader(InputStream inputStream) {
         this.br = new BufferedReader(new InputStreamReader(inputStream), 32768);
         this.st = null;
      }

      public String nextToken() {
         while (st == null || !st.hasMoreTokens()) {
            try {
               st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
               throw new RuntimeException(e);
            }
         }
         return st.nextToken();
      }

      public int nextInt() {
         return Integer.parseInt(nextToken());
      }

      public long nextLong() {
         return Long.parseLong(nextToken());
      }

      public double nextDouble() {
         return Double.parseDouble(nextToken());
      }
   }

   public static void main(String[] args) throws Exception {
      InputStream inputStream = INPUT_FILE_PATH.isEmpty()
         ? System.in
         : new FileInputStream(new File(INPUT_FILE_PATH));
      OutputStream outputStream = System.out;

      InputReader inputReader = new InputReader(inputStream);
      PrintWriter printWriter = new PrintWriter(outputStream);

      new Main(inputReader, printWriter).solve();

      printWriter.close();
   }

}
