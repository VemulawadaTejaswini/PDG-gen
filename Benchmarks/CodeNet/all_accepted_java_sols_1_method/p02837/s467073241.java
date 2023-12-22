import java.util.*;
import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int[][] x = new int[N][];
    int[][] y = new int[N][];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      x[i] = new int[A[i]];
      y[i] = new int[A[i]];
      for (int j = 0; j < A[i]; j++) {
        x[i][j] = sc.nextInt();
        y[i][j] = sc.nextInt();
      }
    }
    sc.close();

    int ans = 0;
    for (int n = 1; n < (int) Math.pow(2 , N); n++) {
      int[] ns = new int[N];
      for (int i = 0; i < N; i++)
        ns[i] = (n & (int) Math.pow(2 , i)) == 0 ? 0 : 1;
      
      boolean h = true;
      for (int i = 0; h && i < N; i++)
        if (ns[i] != 0)
          for (int j = 0; h && j < x[i].length; j++)
            if (y[i][j] != ns[x[i][j] - 1]) h = false;
      if (!h) continue;

      int a = 0;
      for (int i = 0; i < N; i++) a+= ns[i];
      ans = Math.max(ans, a);
    }
    System.out.println(ans);
  }
}
