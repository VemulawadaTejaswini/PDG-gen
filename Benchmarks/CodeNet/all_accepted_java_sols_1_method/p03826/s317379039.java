import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();

    int area1 = a * b;
    int area2 = c * d;

    // 三項間演算子
    // 式(boolean) ? 答え1 : 答え2
    int maxArea = area1 >= area2 ? area1 : area2;
    System.out.println(maxArea);
  }
}
