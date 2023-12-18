import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = Integer.parseInt(sc.next());
    List<String> inserts = new ArrayList<String>(size);
    List<String> results = new ArrayList<String>(size);
    String input;
    String find;

    int asciiIndex;
    // boolean first = true;

    for (int i = 0; i < size; i++) {

      if (sc.next().equals("insert")) {
        inserts.add(sc.next());

        // if (first) {
        //     first = false;
        // }

      } else {

        // if (first) {
        //   results[fIndex] = "no";
        //   fIndex++;
        //   continue;
        // }

        results.add(search(sc.next(), inserts) ? "yes" : "no");
      }
    }

    for (String result : results) {
      System.out.println(resulta);
    }
  }

  public static boolean search(String find, List<String> inserts) {
    for (String check : inserts) {
      if (check.equals(find)) {
        return true;
      }
    }

    return false;
  }
}

