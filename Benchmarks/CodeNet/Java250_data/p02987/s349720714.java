import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    boolean ret = true;
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (char c: str.toCharArray())
      if (map.containsKey(c))
        map.put(c, map.get(c) + 1);
      else
        map.put(c, 1);
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() != 2)
        ret = false;
    }
    if (ret)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}