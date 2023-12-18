
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

   private static final String INPUT_FILE_PATH = "";

   static int[] ans;

   static boolean solve(int[] a, int[] b) {
      int n = a.length;
      int l = 0, r = n - 1;
      for (int i = 0; i < n; i++) {
         if (b[l] == a[i] && b[r] == a[i]) {
            return false;
         }
         if (b[l] != a[i]) {
            ans[i] = b[l];
            l++;
         } else {
            ans[i] = b[r];
            r--;
         }
      }
      return true;
   }

   static void solve(InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];
      for (int i = 0; i < n; i++) {
         a[i] = in.nextInt();
      }
      for (int i = 0; i < n; i++) {
         b[i] = in.nextInt();
      }
      ans = new int[n];

      boolean ok = solve(a, b);
      if (!ok) {
         for (int i = 0; i < n / 2; i++) {
            int tmp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = tmp;
         }
         ok = solve(a, b);
      }

      if (ok) {
         out.println("Yes");
         for (int i = 0; i < n; i++) {
            out.print(ans[i] + " ");
         }
         out.println();
      } else {
         out.println("No");
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
