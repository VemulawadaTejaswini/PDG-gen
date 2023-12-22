import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    Map<Integer, List<Integer>> map = new HashMap<>();
    for(int i = 0; i < M; i++){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      if(map.get(a) == null){
        map.put(a, new ArrayList<>());
        map.get(a).add(b);
      }else{
        map.get(a).add(b);
      }
    }
    
    String ans = "IMPOSSIBLE";
    for(int i = 0; i < map.get(1).size(); i++){
      int n = map.get(1).get(i);
      if(map.get(n) != null){
        if(map.get(n).contains(N)){
          ans = "POSSIBLE";
          break;
        }
      }
    }
    System.out.println(ans);
  }
}