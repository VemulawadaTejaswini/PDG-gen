
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

   private static final String INPUT_FILE_PATH = "";

   static void solve(InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      long k = in.nextLong();

      long[] a = new long[n + 1];
      long[] psa = new long[n + 1];
      long[] b = new long[m + 1];
      long[] psb = new long[m + 1];
      TreeMap<Long, Integer> tm = new TreeMap();
      for (int i = 1; i <= n; i++) {
         a[i] = in.nextLong();
         psa[i] = psa[i - 1] + a[i];
      }
      for (int i = 1; i <= m; i++) {
         b[i] = in.nextLong();
         psb[i] = psb[i - 1] + b[i];
         tm.put(psb[i], i);
      }
      int ans = 0;
      for (int i = 0; i <= n; i++) {
         if (psa[i] > k) break;
         long diff = k - psa[i];

         if (tm.firstKey() > k) {
            ans = Math.max(ans, i);
         } else {
            ans = Math.max(ans, i + tm.floorEntry(diff).getValue());
         }
      }
      out.println(ans);
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

      solve(inputReader, printWriter);

      printWriter.close();
   }

}
