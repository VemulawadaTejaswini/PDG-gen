import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int A = scn.nextInt();
    int B = scn.nextInt();

    boolean found = false;
    for (int i = 0; i < Math.max(A, B); i++) {
      if (Math.abs(A - i) == Math.abs(B - i)) {
        System.out.println(i);
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("IMPOSSIBLE");
    }
  }
}