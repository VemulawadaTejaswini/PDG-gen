import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int A = in.nextInt(), B = in.nextInt(), C = in.nextInt();
    System.out.println(Math.max(0, B + C - A));
  }
}
