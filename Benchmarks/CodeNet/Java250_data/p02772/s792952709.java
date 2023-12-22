import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    boolean ok = true;
    for (int i = 0; i < n; i++) {
      int t = in.nextInt();
      if (t % 2 == 0 && !(t % 3 == 0 || t % 5 == 0)) {
        ok &= false;
      }
    }
    System.out.println(ok ? "APPROVED" : "DENIED");
  }
}
