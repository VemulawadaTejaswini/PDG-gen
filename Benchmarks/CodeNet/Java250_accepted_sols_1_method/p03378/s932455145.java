import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int Zero = 0;
    int cnt = 0;
    for (int i = 0; i < M; i++) {
      if (X > sc.nextInt()) {
        Zero++;
      } else {
        cnt++;
      }
    }
    System.out.println(Math.min(Zero, cnt));
  }
}
