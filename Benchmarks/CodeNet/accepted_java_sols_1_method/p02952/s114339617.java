import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int a = 10;
    int i = 1;
    int count = 0;
    while (N >= a) {
      int j = 9;
      for (int k = 1; k < i; k++) j *= 10;
      count += j;
      i += 2;
      a *= 100;
    }
    a /= 10;
    if (N >= a) {
      count += N - a + 1;
    }
    System.out.println(count);
  }
}
