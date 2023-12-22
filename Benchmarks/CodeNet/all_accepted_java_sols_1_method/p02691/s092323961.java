import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long answer = 0;
    int n = sc.nextInt();
    HashMap<Integer, Integer> mapL = new HashMap<>();
    HashMap<Integer, Integer> mapR = new HashMap<>();
    for(int i = 1; i <= n; i++){
      int height = sc.nextInt();
      int l = height + i;
      int r = i - height;
      if(mapL.containsKey(l)){
        mapL.put(l, mapL.get(l) + 1);
      } else {
        mapL.put(l, 1);
      }

      if(mapR.containsKey(r)){
        mapR.put(r, mapR.get(r) + 1);
      } else {
        mapR.put(r, 1);
      }
    }
    for(Entry<Integer, Integer> entry : mapL.entrySet()){
      long cntL = entry.getValue();
      long cntR = (mapR.containsKey(entry.getKey())) ? mapR.get(entry.getKey()) : 0 ;
      long temp = cntL * cntR;
      answer += temp;
    }
    System.out.println(answer);
  }
}