import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      int count = 0;
      for (int a = 0; a < 10; a++) {
        for (int b = 0; b < 10; b++) {
          for (int c = 0; c < 10; c++) {
            int candidateOfD = n - a - b - c;
            if (0 <= candidateOfD && candidateOfD <= 9) {
              count++;
            } else if (candidateOfD < 0) {
              break;
            }
          }
        }
      }
      System.out.println(count);
    }

  }
}

