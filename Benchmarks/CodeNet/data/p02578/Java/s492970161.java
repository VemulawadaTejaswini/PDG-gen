
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

   void solve() {
      int n = in.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) a[i] = in.nextInt();
      long ans = 0;
      for (int i = 1; i < n; i++) {
         if (a[i] < a[i - 1]) {
            ans += (a[i - 1] - a[i]);
            a[i] = a[i - 1];
         }

      }
      out.println(ans);
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
