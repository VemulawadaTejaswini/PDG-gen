import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.IndexOutOfBoundsException;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    Collections.sort(list);

    boolean ok = true;
    int res = 0;
    ArrayList<Integer> avoid = new ArrayList<Integer>();

    for (int i = 0; i < n; i++) {
      if (!avoid.contains(i)) {
        ok = true;
        try {
          if (list.get(i) == list.get(i + 1)) {
            continue;
          }
        } catch (IndexOutOfBoundsException e) {
        }
        for (int j = 0; j < i; j++) {
          if (list.get(i) % list.get(j) == 0) {
            ok = false;
            break;
          }
        }
        for (int j = i + 1; j < n; j++) {
          if (list.get(j) % list.get(i) == 0) {
            avoid.add(j);
          }
        }
        if (ok) {
          res++;
        }
      }
    }
    System.out.println(res);
  }

}