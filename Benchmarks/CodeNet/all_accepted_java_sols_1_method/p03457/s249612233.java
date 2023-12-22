import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] t = new int[N];
    int[] x = new int[N];
    int[] y = new int[N];

    for (int i = 0; i < N; i++) {
      t[i] = sc.nextInt();
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }

    sc.close();

    String result = "Yes";

    for (int i = 0; i < N; i++) {

      if (t[i] < x[i] + y[i]) {
        result = "No";
        break;
      } else {
        if (((x[i] + y[i]) % 2) != (t[i] % 2)) {
          result = "No";
          break;
        }
      }
    }

    System.out.println(result);

  }

}