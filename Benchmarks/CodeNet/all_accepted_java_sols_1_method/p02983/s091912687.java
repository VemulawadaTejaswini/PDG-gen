import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int L = in.nextInt(), R = in.nextInt();
    int ans = Integer.MAX_VALUE;
    for (int i = L; i < Math.min(L + 2019, R); i++) {
      for (int j = i + 1; j <= Math.min(L + 2019, R); j++) {
        ans = Math.min(ans, (int) (((long) i * (long) j) % 2019));
      }
    }
    System.out.println(ans);
  }
}