import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Set<String> set = new HashSet<String>();
    Scanner scanner = new Scanner(System.in);
    char last = '\0';
    String result = "Yes";

    int N = scanner.nextInt();

    scanner.nextLine();
    for (int i = 0; i < N; i++) {
      String w = scanner.nextLine();

      if (set.contains(w)) {
        result = "No";
        break;
      }

      if (i > 0) {
        if (w.charAt(0) != last) {
          result = "No";
          break;
        }
      }
      set.add(w);
      last = w.charAt(w.length() - 1);
    }
    System.out.println(result);
  }

}
