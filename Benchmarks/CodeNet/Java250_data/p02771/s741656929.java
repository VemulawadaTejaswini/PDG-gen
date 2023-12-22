import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int cnt = 0;
    if (A == B) {
      cnt++;
    }
    ;
    if (B == C) {
      cnt++;
    }
    ;
    if (C == A) {
      cnt++;
    }
    ;
    if (cnt == 1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
