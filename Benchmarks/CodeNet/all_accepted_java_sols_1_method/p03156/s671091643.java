import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();

    int num1 = 0, num2 = 0, num3 = 0;
    for (int i = 0; i < N; i++) {
      int p = scanner.nextInt();
      if (p <= A) num1++;
      else if (p <= B) num2++;
      else num3++;
    }
    System.out.println(Math.min(num1, Math.min(num2, num3)));
  }
}
