import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int D = scanner.nextInt();
    int N = scanner.nextInt();

    if (N == 100) N += 1;
    int i = 1;
    while (D > 0) {
      i *= 100;
      D--;
    }
    System.out.println(i * N);
  }
}
