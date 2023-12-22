import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    Map<String, Integer> map = new HashMap<>();
    int max = 0;
    for(int i = 0; i < N; i++){
      String s = sc.nextLine();
      if(map.containsKey(s)){
        int n = map.get(s)+1;
        max = Math.max(n, max);
        map.put(s, n);
      }else{
        map.put(s, 1);
        max = Math.max(max, 1);
      }
    }
    List<String> list = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if(entry.getValue() == max){
        list.add(entry.getKey());
      }
    }
    Collections.sort(list);
    for(String st : list){
      System.out.println(st);
    }
  }
}
