import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<String,Integer> map = new HashMap<>();
    ArrayList<String> set = new ArrayList<>();
    set.add("AC");
    set.add("TLE");
    set.add("RE");
    set.add("WA");
    for(int i=0;i<n;i++){
      String a = sc.next();
      map.put(a,map.getOrDefault(a,0)+1);
    }
    for(Map.Entry<String,Integer> entry : map.entrySet()){
      System.out.println(entry.getKey()+" "+"x"+" "+entry.getValue());
      set.remove((String)entry.getKey());
    }
    while(set.size()>0){
        System.out.println(set.get(0)+" "+"x"+" "+0);
        set.remove(0);
    }
  }
}