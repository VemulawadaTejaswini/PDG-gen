import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int A = in.nextInt();
      int B = in.nextInt();
      int ans = Math.max(0, A - 2 * B);
      
      System.out.println(ans);
    }
  }
}