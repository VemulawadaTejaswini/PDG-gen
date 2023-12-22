import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    boolean ok = false;
    LOOP: for (int i = 0; i <= n; i += 4) {
      for (int j = 0; i + j <= n; j += 7) {
        if (i + j == n) {
          ok = true;
          break LOOP;
        }
      }
    }

    if (ok) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    
    sc.close(); 
  }
}
