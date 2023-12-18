import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);

    while (true) {
      int n = stdin.nextInt();
      int x = stdin.nextInt();
      if (n == 0 && x == 0) {
        break;
      }

      List<String> list = new ArrayList<String>();
      for (int i = 1; i <= n; i++) {
        for (int j = i + 1; j <= n; j++) {
          if (i + j >= x) {
            break;
          }

          int k = x - i - j;
          if (k <= n && k > 0 && k != i && k != j) {
            int[] arr = { i, j, k };
            Arrays.sort(arr);
            String s = Arrays.toString(arr);
            if (!list.contains(s)) {
              list.add(s);
            }
          }
        }
      }

      System.out.println(list.size());
    }
  }

}