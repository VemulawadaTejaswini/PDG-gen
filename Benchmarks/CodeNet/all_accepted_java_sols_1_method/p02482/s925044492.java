import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    String order;
    if (a < b) {
      order = "a < b";
    } else if (a > b) {
      order = "a > b";
    } else {
      order = "a == b";
    }
    System.out.println(order);
  }
}