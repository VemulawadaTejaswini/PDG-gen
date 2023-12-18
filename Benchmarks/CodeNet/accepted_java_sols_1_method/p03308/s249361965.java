import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int min = Integer.MAX_VALUE;
    int max = 0;
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      if (a < min) min = a;
      if (a > max) max = a;
    }
    System.out.println(max - min);
  }
}
