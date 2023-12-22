import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      Map<Character, Integer> freq = new HashMap<>();
      freq.put('M', 0);
      freq.put('A', 0);
      freq.put('R', 0);
      freq.put('C', 0);
      freq.put('H', 0);

      for(int i = 0; i < n; i++) {
        char c = sc.next().charAt(0);
        if(freq.containsKey(c))
          freq.put(c, freq.get(c) + 1);
      }

      long cnt = 0;
      List<Integer> vals = new ArrayList<>(freq.values());
      for(int i = 0; i < vals.size(); i++) {
        long a = vals.get(i);
        if(a == 0) continue;
        for(int j = i + 1; j < vals.size(); j++) {
          long b = vals.get(j);
          if(b == 0) continue;
          for(int k = j + 1; k < vals.size(); k++) {
            long c = vals.get(k);
            if(c == 0) continue;
            cnt += a * b * c;
          }
        }
      }
      

      System.out.println(cnt);
  }
}
