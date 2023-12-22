import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    System.out.println((A - B) % 2 == 0 ? "Alice" : "Borys");
  }

}
