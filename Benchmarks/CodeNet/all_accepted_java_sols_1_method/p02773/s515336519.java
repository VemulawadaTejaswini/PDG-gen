import java.util.*;
public class Main {
	public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      Map<String,Integer> map = new HashMap<>();
      int maxVal = 1;
      for (int i=0; i<N; i++) {
        String key = sc.next();
        if (map.keySet().contains(key)) {
          int mgk = map.get(key);
          maxVal = Math.max(maxVal,++mgk);
          map.replace(key,mgk);
        } else {
          map.put(key,1);
        }
      }
      final int finalVal = maxVal;
      ArrayList<String> list = new ArrayList<>();
      map.forEach((k,v) -> {
        if (v == finalVal) {
          list.add(k);
        }
      });
      Collections.sort(list);
      for (String ans : list)
        System.out.println(ans);
      
    }
}