import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    String S = sc.next();
    if (S.length() != A + B + 1 || S.charAt(A) != '-') {
      System.out.println("No");
      return;
    }
    for (int i = 0; i < A; i++) {
      char c = S.charAt(i);
      if (c < '0' || '9' < c) {
        System.out.println("No");
        return;
      }
    }
    for (int i = A+1; i < A+1+B; i++) {
      char c = S.charAt(i);
      if (c < '0' || '9' < c) {
        System.out.println("No");
        return;
      }
    }
    
    System.out.println("Yes");
  }
}