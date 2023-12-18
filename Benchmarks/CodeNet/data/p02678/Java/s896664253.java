import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < m; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    sc.close();

    int[] guidePost = new int[n];
    List<Integer> check = new ArrayList<>();
    check.add(1);

    List<List<Integer>> route = new ArrayList<>();
    List<Integer> first = new ArrayList<>();

    first.add(1);
    route.add(first);

    //i番目の道について
    for (int i = 0; i < m; i++) {
      //j回でたどりつく
      for (int j = 0; j < n; j++) {
        List<Integer> list = new ArrayList<>();

        if (route.get(j).contains(a[i])) {
          list.add(b[i]);
          guidePost[b[i] - 1] = a[i];
          check.add(b[i]);
        }

        if (route.get(j).contains(b[i])) {
          list.add(a[i]);
          guidePost[a[i] - 1] = b[i];
          check.add(a[i]);
        }

        route.add(list);
      }
    }

    boolean exist = true;
    for (int i = 0; i < n; i++) {
      if (!check.contains(i + 1)) {
        exist = false;
        break;
      }
    }

    if (exist) {
      System.out.println("Yes");
      for (int i = 1; i < n; i++) {
        System.out.println(guidePost[i]);
      }
    } else {
      System.out.println("No");
    }

  }
}
