public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (true) {
      long x = new java.util.Scanner(System.in).nextLong();
      i++;
      System.out.println("Case "+ i + ": " + x);
      if (x == 0) break;
    }
  }
}