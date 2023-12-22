import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
  public static void main(String[] args) throws IOException {
    String ans = "Yes";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < str.length(); i++) {
      if (map.containsKey(str.charAt(i))) {
        map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
      } else {
        map.put(str.charAt(i), 1);
      }
    }
    for (Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() % 2 == 1) {
        ans = "No";
        break;
      }
    }
    System.out.print(ans);
  }
}