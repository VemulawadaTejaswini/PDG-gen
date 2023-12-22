import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    long W = in.nextLong();
    long H = in.nextLong();
    long x = in.nextLong();
    long y = in.nextLong();
    System.out.println((W * H / 2.0) + " " + (W == x * 2 && H == y * 2 ? 1 : 0));
  }
}