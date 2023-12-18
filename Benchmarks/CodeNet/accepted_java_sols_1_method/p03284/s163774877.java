import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int K = in.nextInt();

      if (N % K == 0) {
        System.out.println(0);
      } else {
        System.out.println(1);
      }
    }
  }
}