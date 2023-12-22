import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    String[] D = new String[K];

    for (int i = 0; i < K; i++) {
      D[i] = sc.next();
    }

    sc.close();

    for (int i = N; i < 100000; i++) {

      String s = String.valueOf(i);
      
      boolean result = true;
      
      for (int j = 0; j < K; j++) {
        if (0 <= s.indexOf(D[j])) {
          result = false;
          break;
        }
      }

      if (result) {
        System.out.println(i);
        break;
      }

    }

  }

}