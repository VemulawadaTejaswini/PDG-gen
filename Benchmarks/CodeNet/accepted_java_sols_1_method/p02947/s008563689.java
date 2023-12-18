import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<Long, Long> map = new HashMap<Long, Long>();
    for(int i = 0; i < n; i++) {
      String s = sc.next();
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int j = 0; j < s.length(); j++) {
        int t = s.charAt(j) - 'a';
        list.add(t);
      }
      Collections.sort(list);
      long t = 0;
      for(int j = 0; j < list.size(); j++) {
        t += ((long)(Math.pow(26, j)) * (long)list.get(j));
      }
      if(map.containsKey(t)) {
        map.put(t, map.get(t) + 1);
      } else {
        map.put(t, (long)1);
      }
    }
    long ans = 0;
    for(long key : map.keySet()) {
      long t = map.get(key);
      ans += ((t * (t - 1)) / 2);
    }
    System.out.println(ans);
  }
}
