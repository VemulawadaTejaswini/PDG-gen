import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] S = scanner.nextLine().toCharArray();

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < 4; i++) {
      if (map.containsKey(S[i])) {
        map.put(S[i], map.get(S[i]) + 1);
      } else {
        map.put(S[i], 1);
      }
    }

    boolean isFiftyFifty = true;
    for (char key : map.keySet()) {
      if (map.get(key) != 2) {
        isFiftyFifty = false;
      }
    }

    if (isFiftyFifty) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}