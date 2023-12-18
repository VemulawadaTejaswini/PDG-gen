import java.util.Scanner;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    HashSet<String> S = new HashSet<String>();
    List<String> results = new ArrayList<String>();
    for (int i = 0; i < n; i++) {
      String cmd = s.next();
      String str = s.next();

      switch(cmd) {
        case "insert":
          S.add(str);
          break;
        case "find":
          if (S.contains(str))
            results.add("yes");
          else
            results.add("no");
          break;
        default:
          break;
      }
    }
    s.close();
    for (String result : results) {
      System.out.println(result);
    }
  }
}

