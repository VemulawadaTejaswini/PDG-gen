
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws Exception {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    // Your code here!
    Scanner scan = new Scanner(is);
    int N = scan.nextInt();
    int A[] = new int[N];
    int maxA[] = new int[N];

    int max = 0;

    for(int i = 0; i < N; i++) {
      A[i] = scan.nextInt();
      if(A[i] > max){
        max = A[i];
      }
      maxA[i] = max;
    }

    long ans = 0;

    for(int i = 0; i < N; i++) {
      ans += maxA[i] - A[i];
    }

    os.println(ans);
  }
}
