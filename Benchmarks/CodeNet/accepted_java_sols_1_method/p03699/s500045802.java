import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());
    int[] s = new int[n];
    int sum = 0;

    for (int i = 0; i < n; i++) {
      s[i] = Integer.parseInt(sc.next());
      sum += s[i];
    }

    Arrays.sort(s);

    boolean flag = false;
    if (sum % 10 == 0) {
      for (int i = 0; i < n; i++) {
        if (s[i] % 10 != 0) {
          sum -= s[i];
          flag = true;
          break;
        }
      }
    } else {
      flag = true;
    }

    if (flag) {
      System.out.println(sum);
    } else {
      System.out.println(0);
    }

    sc.close();
  }
}
