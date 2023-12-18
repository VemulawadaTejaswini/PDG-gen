public class Main {
  public static void main(String[] args) {
    int k = new java.util.Scanner(System.in).nextInt();
    if (k % 2 == 0) {
      System.out.println((k / 2)*(k / 2));
    } else {
      System.out.println((k / 2 + 1) * (k / 2));
    }
  }
}
