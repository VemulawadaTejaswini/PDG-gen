import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int X = scanner.nextInt();
    for (long i = 1; i <= 100_000; i++) {
      if (i * (i + 1) / 2 >= X) {
        System.out.println(i);
        return;
      }
    }
  }
}
