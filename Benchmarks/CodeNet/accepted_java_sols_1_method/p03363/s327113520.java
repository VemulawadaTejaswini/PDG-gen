import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Map<Long, Long> map = new HashMap<>();
      map.put(0L, 1L);
      long sum = 0;
      long cnt = 0;
      for(int i = 0; i < n; i++) {
        sum += sc.nextInt();
        if(map.containsKey(sum)) {
          cnt += map.get(sum);
        }
        map.put(sum, map.getOrDefault(sum, 0L) + 1);
      }
      System.out.println(cnt);
  }
}