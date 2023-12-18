
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

   private static final String INPUT_FILE_PATH = "";

   static int[] parent, sz;

   static int find(int x) {
      if (parent[x] == x) return x;
      return parent[x] = find(parent[x]);
   }

   static void solve(InputReader in, PrintWriter out) {
      int n = in.nextInt(), m = in.nextInt();

      parent = new int[n + 1];
      sz = new int[n + 1];
      for (int i = 1; i <= n; i++) {
         parent[i] = i;
         sz[i] = 1;
      }

      for (int i = 0; i < m; i++) {
         int a = in.nextInt(), b = in.nextInt();

         int ra = find(a), rb = find(b);
         if (ra == rb) continue;
         parent[rb] = ra;
         sz[ra] += sz[rb];
      }

      int ans = 1;
      for (int i = 1; i <= n; i++) {
         ans = Math.max(ans, sz[i]);
      }
      out.println(ans);
   }

   public static void main(String[] args) throws Exception {
      InputStream inputStream = INPUT_FILE_PATH.isEmpty()
         ? System.in
         : new FileInputStream(new File(INPUT_FILE_PATH));
      OutputStream outputStream = System.out;

      InputReader inputReader = new InputReader(inputStream);
      PrintWriter printWriter = new PrintWriter(outputStream);

      solve(inputReader, printWriter);

      printWriter.close();
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

}
