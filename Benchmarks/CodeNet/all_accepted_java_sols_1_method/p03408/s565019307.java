import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String, Integer> map = new HashMap<>();
    for(int i = 0; i < n; i++) {
      String str = sc.next();
      if(map.containsKey(str)) {
        map.put(str, map.get(str) + 1);
      } else {
        map.put(str, 1);
      }
    }
    int m = sc.nextInt();
    for(int i = 0; i < m; i++) {
      String str = sc.next();
      if(map.containsKey(str)) {
        map.put(str, map.get(str) - 1);
      }
    }
    int ans = 0;
    for(Map.Entry<String, Integer> entry : map.entrySet()) {
      if(ans < entry.getValue()) ans = entry.getValue();
    }
    System.out.println(ans);
  }
}