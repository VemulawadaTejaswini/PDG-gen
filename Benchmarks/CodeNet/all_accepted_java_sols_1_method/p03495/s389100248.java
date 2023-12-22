import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      Map<Integer, Integer> freq = new HashMap<>();
      for(int i = 0; i < n; i++){
        int num = sc.nextInt();
        freq.put(num, freq.getOrDefault(num, 0) + 1);
      }
      int cnt = 0;
      ArrayList<Integer> vals = new ArrayList<>(freq.values()); 
      Collections.sort(vals, Collections.reverseOrder());
      for(int i = k; i < vals.size(); i++)
        cnt += vals.get(i);
      System.out.println(cnt);
  }
}