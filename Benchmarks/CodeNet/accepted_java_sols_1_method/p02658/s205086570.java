import java.util.*;
import java.util.stream.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    List<Long> A = Arrays.stream(sc.nextLine().split(" "))
      .map(Long::parseLong)
      .collect(Collectors.toList());
    if (A.contains(0L)) {
      System.out.println(0);
      return;
    }
    BigDecimal ans = BigDecimal.valueOf(1);
    for (int i = 0; i < N; i++) {
      ans = ans.multiply(BigDecimal.valueOf(A.get(i)));
      if (ans.compareTo(BigDecimal.valueOf(1).scaleByPowerOfTen(18)) > 0) {
        ans = BigDecimal.valueOf(-1);
        break;
      }
    }
    System.out.println(ans);
  }
}