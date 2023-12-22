import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    char[] s = scanner.next()
        .toCharArray();
    Set<String> done1 = new HashSet<>();
    Set<String> done2 = new HashSet<>();
    Set<String> done3 = new HashSet<>();

    for (int i = 0; i < s.length - 2; i++) {
      if (done1.contains(String.valueOf(s[i]))) {
        continue;
      } else {
        done1.add(String.valueOf(s[i]));
      }
      for (int j = i + 1; j < s.length - 1; j++) {
        if (done2.contains(s[i] + String.valueOf(s[j]))) {
          continue;
        } else {
          done2.add(s[i] + String.valueOf(s[j]));
        }
        for (int k = j + 1; k < s.length; k++) {
          done3.add(s[i] + String.valueOf(s[j]) + s[k]);
        }
      }
    }
    System.out.println(done3.size());
  }
}
