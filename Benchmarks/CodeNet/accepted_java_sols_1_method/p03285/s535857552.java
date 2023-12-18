import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (in.hasNext()) {
      int N = in.nextInt();
      boolean canExactlyN = false;

      for (int i = 0; i <= N && canExactlyN == false; i += 4) {
        for (int j = 0; j <= N; j += 7) {
          if (i + j == N) {
            canExactlyN = true;
            break;
          }
        }
      }

      if (canExactlyN) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}