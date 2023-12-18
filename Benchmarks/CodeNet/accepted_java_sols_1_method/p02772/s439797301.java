import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int data[] = new int[n];
    boolean t = true;

    for (int i = 0 ; i < n ; i++ ) {
      data[i] = sc.nextInt();
    }

    for (int i = 0 ; i < n ; i++) {
      if ((data[i] % 2 == 0 && (data[i] % 3 == 0 || data[i] % 5 == 0)) || data[i] % 2 == 1) {
        t = true;
        continue;
      } else {
        t = false;
        break;
      }
    }

      if (t == true) {
        System.out.println("APPROVED");
      } else {
      System.out.println("DENIED");
      }

  }
}
