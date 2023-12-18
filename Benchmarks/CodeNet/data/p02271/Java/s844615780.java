import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] elem = new int[n];
    for (int i = 0 ; i < n; i++) {
      elem[i] = Integer.parseInt(sc.next());
    }
    int q = Integer.parseInt(sc.next());
    int[] checks = new int[q];
    for (int i = 0 ; i < q; i++) {
      checks[i] = Integer.parseInt(sc.next());
    }

    for (int check : checks) {
      if (solve(elem, 0, check)) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }

  public static boolean solve(int[] elem, int i, int target) {

    if (target == 0) {
      return true;

    } else if (target < 0) {
      return false;

    } else if (i >= elem.length) {
      return false;

    } else {
      return solve(elem, i + 1, target - elem[i])
          || solve(elem, i + 1, target);
    }
  }
}

