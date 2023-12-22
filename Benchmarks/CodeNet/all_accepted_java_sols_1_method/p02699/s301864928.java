import java.util.*;
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Integer s = sc.nextInt();
    Integer w = sc.nextInt();
    if (s <= w) {
      System.out.println("unsafe");
    } else {
      System.out.println("safe");
    }
    sc.close();

  }
}