import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    if (A == B) {
      System.out.print(C);
    } else if (B == C) {
      System.out.print(A);
    } else {
      System.out.print(B);
    }
  }
}