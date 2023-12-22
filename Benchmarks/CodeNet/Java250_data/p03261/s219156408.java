import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

  public static void main(String[] args) throws Exception {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.println(validate(reader.lines().iterator()) ? "Yes" : "No");
    }
  }

  private static boolean validate(Iterator<String> lines) {
    int count = Integer.parseInt(lines.next());
    // ほんとうはこんなコード書きたくない
    int lastChar = -1;
    Set<String> remember = new HashSet<>();
    for (; count != 0; --count) {
      final String line = lines.next();
      if (line == null) return false;
      if (remember.contains(line))
        return false;
      remember.add(line);
      final int length = line.length();
      if (lastChar != -1) {
        if (length == 0 || line.charAt(0) != lastChar) { return false; }
      }
      lastChar = line.charAt(length - 1);
    }
    return true;
  }

}
