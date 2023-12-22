import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = in.nextInt();
    }
    Arrays.sort(A);
    System.out.println(A[N / 2] - A[N / 2 - 1]);
  }
}