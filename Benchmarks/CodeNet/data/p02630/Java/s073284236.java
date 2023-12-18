
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

   static final int MAX = (int) 1e5;

   static void solve(InputReader in, PrintWriter out) {
      int n = in.nextInt();
      long[] counts = new long[MAX + 1];
      long sum = 0;
      for (int i = 0; i < n; i++) {
         int a = in.nextInt();
         counts[a]++;
         sum += a;
      }
      int q = in.nextInt();
      for (int i = 0; i < q; i++) {
         int b = in.nextInt();
         int c = in.nextInt();

         sum -= counts[b] * b;
         sum += counts[b] * c;
         counts[c] += counts[b];
         counts[b] = 0;

         out.println(sum);
      }
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
