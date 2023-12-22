import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int cnt = 0;
    for (int i = A; i <= B; i++) {
      String C = String.valueOf(i);
      String D = C.substring(0, 1);
      String E = C.substring(C.length() - 1, C.length());
      String F = C.substring(1, 2);
      String G = C.substring(C.length() - 2, C.length() - 1);
      if (D.equals(E) && F.equals(G)) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
