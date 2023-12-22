import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    List<Integer>[] pos = new List[26];
    for (int i = 0; i < 26; i++) {
      pos[i] = new ArrayList<>();
    }
    for (int i = 0; i < s.length; i++) {
      pos[s[i] - 'a'].add(i);
    }
    int min = s.length;
    for (int i = 0; i < 26; i++) {
      if (pos[i].isEmpty()) continue;
      int max = 0;
      int p = 0;
      Iterator<Integer> iter = pos[i].iterator();
      while (iter.hasNext()) {
        int q = iter.next();
        max = Math.max(max, q - p);
        p = q + 1;
      }

      max = Math.max(max, s.length - p);
      min = Math.min(min, max);
    }
    System.out.println(min);
  }
}
