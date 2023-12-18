import java.util.*;
import java.io.*;

/**
 * Made by egor https://github.com/chermehdi/egor.
 * 
 * @author Azuz
 * 
 */
public class Main {

    void solve(Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int[] arr = new int[n];
      
      int gcd = 0;

      boolean setwise = false;
      boolean pairwise = false;
      for (int i = 0; i < n; ++i) {
        arr[i] = in.nextInt();
        gcd = gcd(gcd, arr[i]);
      }

      if (gcd == 1) setwise = true;
      HashSet<Integer> set = new HashSet<>();
      boolean flag = true;
      for (int i = 0; i < n && flag; ++i) {
        int x = arr[i];
        if (x % 2 == 0) {
          if (set.contains(2)) {
            flag = false;
            break;
          }
          set.add(2);
          while (x % 2 == 0) x >>= 1;
        }

        for (int j = 3; j * j <= x; j += 2) {
          if (n % j == 0) {
            if (set.contains(j)) {
              flag = false;
              break;
            }
            set.add(j);
            while (x % j == 0) x /= j;
          }
        }

        if (x > 2) {
          if (set.contains(x)) {
            flag = false;
            break;
          }
          set.add(x);
        }
      }

      pairwise = flag;


      if (pairwise) {
        out.println("pairwise coprime");
      } else if (setwise) {
        out.println("setwise coprime");
      } else {
        out.println("not coprime");
      }
    }

    private int gcd(int a, int b) {
      if (b == 0) return a;
      return gcd(b, a % b);
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
