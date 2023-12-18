import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split("\\s+");
    int n = Integer.parseInt(strs[0]);
    int q = Integer.parseInt(strs[1]);
    Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
    Map<Integer, Integer> curr = new HashMap<>();
    strs = br.readLine().split("\\s+");
    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(strs[i]);
      curr.put(num, curr.getOrDefault(num, 0) + 1);
      map.put(i, new HashMap<>(curr));
    }
    for (int i = 0; i < q; i++) {
      strs = br.readLine().split("\\s+");
      int left = Integer.parseInt(strs[0]) - 1;
      int right = Integer.parseInt(strs[1]) - 1;
      Map<Integer, Integer> rightMap = map.get(right);
      if (left == 0) {
        System.out.println(rightMap.size());
      }
      else {
        Map<Integer, Integer> leftMap = map.get(left - 1);
        int count = rightMap.size();
        for (Integer key : leftMap.keySet()) {
          int val = rightMap.get(key) - leftMap.get(key);
          if (val == 0) {
            count--;
          }
        }
        System.out.println(count);
      }
    }
  }
}
