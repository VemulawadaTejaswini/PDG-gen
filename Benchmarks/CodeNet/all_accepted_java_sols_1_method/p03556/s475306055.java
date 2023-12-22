import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    for (int i = N; 1 <= N; i--) {
      double j = Math.sqrt(i);
      if (j % 1 == 0) {
        System.out.println(i);
        break;
      }
    }

  }

}