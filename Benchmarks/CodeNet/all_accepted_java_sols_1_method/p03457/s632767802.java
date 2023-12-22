import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] x = new int[N];
    int[] y = new int[N];
    int[] t = new int[N];

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
        if (t[i] % 2 == 1 && (x[i] + y[i]) % 2 == 0) {
          result = "No";
          break;
        } else if (t[i] % 2 == 1 && (x[i] + y[i]) % 2 == 0) {
          result = "No";
          break;
        }
      }
    }

    System.out.println(result);

  }

}