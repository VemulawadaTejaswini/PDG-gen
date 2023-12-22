import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    sc.close();

    String result = "NO";

    for (int i = 1; i <= A; i++) {
      int bx = B * i + C;
      if (bx % A == 0) {
        result = "YES";
        break;
      }
    }

    System.out.println(result);

  }

}