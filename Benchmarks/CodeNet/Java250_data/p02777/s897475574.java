import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new java.util.Scanner(System.in);
    String[] st = sc.nextLine().split(" ");
    String S = st[0];
    String T = st[1];
    String[] times = sc.nextLine().split(" ");
    int A = Integer.parseInt(times[0]);
    int B = Integer.parseInt(times[1]);
    String U = sc.nextLine();
    if (S.equals(U)) {
      A -= 1;
    } else if (T.equals(U)) {
      B -= 1;
    }
    System.out.println(A + " " + B);
  }
}
