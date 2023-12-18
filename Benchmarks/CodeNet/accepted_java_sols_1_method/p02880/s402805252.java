import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean q = true;

    for (int i = 1 ; i < 10 ; i++ ) {
      if (n%i==0 && n/i < 10) {
        q = false;
        break;
      } else {
        continue;
      }
    }

    if (q == false) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
