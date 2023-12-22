import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int L = in.nextInt();
    int min = Integer.MAX_VALUE;
    int sum = 0;
    for (int i = 0; i < N; i++) {
      sum += L + i;
      if (Math.abs(L + i) < Math.abs(min)) {
        min = L + i;
      }
    }
    System.out.println(sum - min);
  }
}
