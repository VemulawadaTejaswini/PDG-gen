import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    char[] S = scn.nextLine().toCharArray();

    HashMap<Character, Integer> map = new HashMap<>();
    map.put('0', 0);
    map.put('1', 0);
    for (char ch : S) {
      map.put(ch, map.get(ch) + 1);
    }

    int ans = 2 * Math.min(map.get('0'), map.get('1'));
    System.out.println(ans);

  }

}
