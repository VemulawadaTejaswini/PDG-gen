import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      if (a == 0 && b == 0) break;
    
      for (int i = 0; i < a; ++i) {
        if (i % 2 == 0) {
            for (int j = 0; j < b; ++j) {
              if (j % 2 == 0) System.out.print("#");
              else System.out.print(".");
            }
        }
        else {
          for (int j = 0; j < b; ++j) {
            if (j % 2 == 0) System.out.print(".");
            else System.out.print("#");
          }
      }
        System.out.println();
      }

      System.out.println();
    }
  }
}
