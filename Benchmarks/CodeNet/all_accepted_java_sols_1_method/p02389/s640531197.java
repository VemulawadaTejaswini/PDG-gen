import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int size = a * b;
      int r = 2 * (a + b);
      System.out.println(size + " " + r);
  }
}
