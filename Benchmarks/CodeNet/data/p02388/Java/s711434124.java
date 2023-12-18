public class Main {
  public static void main(String[] args) {
    int x = Integer.valueOf(args[0]);
    System.out.println(cubic(x));
  }

  private static int cubic(int x) {
    return x * x * x;
  }
}