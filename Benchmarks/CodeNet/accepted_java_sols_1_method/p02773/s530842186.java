import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num;
    Map<String, Integer> map = new HashMap<>();

    for(int i=0; i<n; i++){
      String s = sc.next();
      if(map.containsKey(s)){
        num = map.get(s) + 1;
        map.replace(s,num);
      }else{
        map.put(s,1);
      }
    }

    int count_max = 0;

    for(String key:map.keySet()){
      if(count_max<map.get(key)){
        count_max = map.get(key);
      }
    }

    ArrayList<String> list = new ArrayList<>();
    for(String key:map.keySet()){
      if(count_max==map.get(key)){
        list.add(key);
      }
    }

    Collections.sort(list);
    for(String s: list){
      System.out.println(s);
    }



  }
}