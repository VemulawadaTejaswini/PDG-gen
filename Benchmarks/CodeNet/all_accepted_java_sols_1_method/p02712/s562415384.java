import java.util.*;
import java.util.stream.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println(LongStream.rangeClosed(1, sc.nextInt())
      .filter(e -> e % 3 != 0)
      .filter(e -> e % 5 != 0)
      .sum());
  }
}