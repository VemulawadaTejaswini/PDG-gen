import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();
    if ((A >= 1 && A <= 9) && (B >= 1 && B <= 9)) {
      System.out.println(A * B);
    } else {
      System.out.println(-1);
    }
  }
}
