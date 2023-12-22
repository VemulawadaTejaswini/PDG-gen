import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    String[] words = new String[N];
    for (int i = 0; i < N; i++) words[i] = scanner.next();
    Set<String> set = new HashSet<>();
    char last = words[0].charAt(0);
    for (int i = 0; i < N; i++) {
      String w = words[i];
      if (set.contains(w) || last != w.charAt(0)) {
        System.out.println("No");
        return;
      }
      set.add(w);
      last = w.charAt(w.length() - 1);
    }
    System.out.println("Yes");
  }
}
