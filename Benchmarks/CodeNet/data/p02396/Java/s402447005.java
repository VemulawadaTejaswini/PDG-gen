public class Main {
  public static void main(String[] args) {
    for (int v = 1; v <= 10000; v++) {
      int x = new java.util.Scanner(System.in).nextInt();
      System.out.println("Case " + v + ": " + x);
      if (x == 0) break;
    }
  }
}