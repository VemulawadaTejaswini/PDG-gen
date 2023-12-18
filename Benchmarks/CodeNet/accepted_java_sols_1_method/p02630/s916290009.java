import java.util.*;
public class Main {
 
  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Map<Integer, Integer> map = new HashMap<>();
      long sum = 0;
      for(int i = 0; i < n; i++) {
        int num = sc.nextInt();
        sum += num;
        map.put(num, map.getOrDefault(num, 0) + 1);
      }
      int q = sc.nextInt();
      for(int i = 0; i < q; i++) {
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(!map.containsKey(b)) {
          System.out.println(sum);
          continue;
        }
        int freq = map.get(b);
        map.remove(b);
        map.put(c, map.getOrDefault(c, 0) + freq);
        sum = sum + freq * (long)(c - b);
        System.out.println(sum);
      }
      
  }
}