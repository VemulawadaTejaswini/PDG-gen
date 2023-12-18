import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in); 

    while (in.hasNext()) {
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int d = in.nextInt();

      if (Math.abs(b - a) <= d && Math.abs(b - c) <= d || Math.abs(c - a) <= d) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}