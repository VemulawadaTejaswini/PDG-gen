
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

   private static final String INPUT_FILE_PATH = "";

   static ArrayList<Integer> primes;

   static Set<Integer> factor(int num) {
      Set<Integer> res = new HashSet<>();
      for (int prime : primes) {
         while (num % prime == 0) {
            res.add(prime);
            num /= prime;
         }
      }
      if (num > 1) {
         res.add(num);
      }
      return res;
   }

   static void solve(InputReader in, PrintWriter out) {

      primes = new ArrayList<>();
      for (int i = 2; i <= 1000; i++) {
         boolean isPrime = true;
         for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
               isPrime = false;
               break;
            }
         }
         if (isPrime) primes.add(i);
      }

      int n = in.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) a[i] = in.nextInt();

      Set<Integer> allFactors = new HashSet<>();
      Set<Integer> commonFactors = new HashSet<>(primes);
      boolean isPairwiseCoprime = true;
      for (int i = 0; i < n; i++) {
         Set<Integer> factors = factor(a[i]);

         for (int factor : factors) {
            if (allFactors.contains(factor)) {
               isPairwiseCoprime = false;
            }
            allFactors.add(factor);
         }

         commonFactors.retainAll(factors);
      }

      if (isPairwiseCoprime) {
         out.println("pairwise coprime");
      } else if (commonFactors.isEmpty()) {
         out.println("setwise coprime");
      } else {
         out.println("not coprime");
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
