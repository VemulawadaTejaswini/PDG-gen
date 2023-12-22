import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int A = in.nextInt(), B = in.nextInt();
    int c = (A + B);
    if (c % 2 == 0) {
      System.out.println(c / 2);
    } else {
      System.out.println("IMPOSSIBLE");
    }
  }
}
