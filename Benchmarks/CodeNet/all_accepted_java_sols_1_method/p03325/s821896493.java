import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int count = 0;
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      while (a % 2 == 0) {
        count++;
        a /= 2;
      }
    }
    System.out.println(count);
  }
}
