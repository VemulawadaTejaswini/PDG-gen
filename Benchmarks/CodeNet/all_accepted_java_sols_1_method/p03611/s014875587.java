import java.util.*;
import java.math.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < n; i++){
      int tmp = sc.nextInt();
      if(!map.containsKey(tmp)){
        map.put(tmp, 0);
      }
      if(!map.containsKey(tmp+1)){
        map.put(tmp+1, 0);
      }
      if(!map.containsKey(tmp-1)){
        map.put(tmp-1, 0);
      }
      map.put(tmp, map.get(tmp) + 1);
      map.put(tmp + 1, map.get(tmp + 1) + 1);
      map.put(tmp - 1, map.get(tmp - 1) + 1);
    }
    int max = 0;
    for(Integer num : map.values()){
      max = Math.max(max, num);
    }
    System.out.println(max);
  }
}