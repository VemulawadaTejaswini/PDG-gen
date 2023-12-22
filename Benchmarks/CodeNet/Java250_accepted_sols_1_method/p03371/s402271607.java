import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    int X = scanner.nextInt();
    int Y = scanner.nextInt();

    int AB = Math.min(A + B, C * 2);
    int res = 0;
    int numAB = Math.min(X, Y);
    res += numAB * AB;
    X -= numAB;
    Y -= numAB;
    res += Math.min(A, C * 2) * X;
    res += Math.min(B, C * 2) * Y;
    System.out.println(res);
  }
}
