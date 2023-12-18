import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int max = Math.max(A, Math.max(B, C));
    int diff = 3 * max - A - B - C;
    System.out.println(diff % 2 == 0 ? diff / 2 : (diff + 3) / 2);
  }

}
