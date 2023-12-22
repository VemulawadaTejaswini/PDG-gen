import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int k = sc.nextInt();

    HashSet<String> uniqueSubStringSet = new HashSet<String>();
    for (int i = 0; i < s.length(); i++) {
      for (int j = 1; j <= k; j++) {
        uniqueSubStringSet.add(s.substring(i, Math.min(s.length(), i + j)));
      }
    }
    String[] uniqueSubStrings = uniqueSubStringSet.toArray(new String[0]);
    Arrays.sort(uniqueSubStrings);
    System.out.println(uniqueSubStrings[k - 1]);
  }
}
