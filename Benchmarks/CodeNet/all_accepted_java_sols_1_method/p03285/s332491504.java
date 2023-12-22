import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int cakeMax = N/4;
    int donutMax = N/7;
    String result = "No";

    for (int i = 0; i <= cakeMax; i++) {
      for (int j = 0; j <= donutMax; j++) {
        if ( i*4 + j*7 == N) {
          result = "Yes";
          break;
        }
      }
    }
    System.out.println(result);
    scanner.close();
  }
}
