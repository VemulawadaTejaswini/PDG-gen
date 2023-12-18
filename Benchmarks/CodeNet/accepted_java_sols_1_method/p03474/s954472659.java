import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    String S = sc.next();
    boolean flag = true;
    for (int i = 0; i < A; i++) {
      if (S.charAt(i) == '-') {
        flag = false;
      }
    }
    if (S.charAt(A) != '-') {
      flag = false;
    }
    for (int i = A + 1; i < A + B; i++) {
      if (S.charAt(i) == '-') {
        flag = false;
      }
    }
    if (flag) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}