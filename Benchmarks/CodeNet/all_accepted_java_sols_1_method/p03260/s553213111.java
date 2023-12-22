import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int A = in.nextInt();
      int B = in.nextInt();

      if (A % 2 == 0 || B % 2 == 0) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      }
    }
  }
}