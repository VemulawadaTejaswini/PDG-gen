import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int A = in.nextInt();
      int B = in.nextInt();
      int C = in.nextInt();

      if (A == B && B == C) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}