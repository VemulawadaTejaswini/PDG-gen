import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int a = scanner.nextInt();
    final int b = scanner.nextInt();

    if (a > b) {
      for (int i = 0; i < a ;i++) {
        System.out.print(b);
      }
    } else {
      for (int i = 0; i < b; i++) {
        System.out.print(a);
      }
    }
  }
}
