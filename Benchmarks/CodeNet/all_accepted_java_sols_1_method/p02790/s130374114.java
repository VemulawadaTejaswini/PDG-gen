import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();
    int bigger = Math.max(A, B);
    int smaller = Math.min(A, B);
    StringBuilder S = new StringBuilder();
    for (int i = 0; i < bigger; i++) {
      S.append(smaller);
    }
    System.out.println(S);
  }
}
