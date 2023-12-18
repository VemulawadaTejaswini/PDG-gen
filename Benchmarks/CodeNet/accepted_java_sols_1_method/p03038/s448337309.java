import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    TreeMap<Integer,Integer> map = new TreeMap<>();
    for(int i=0;i<n;i++){
      int a = sc.nextInt();
      if(map.containsKey(a))map.put(a,map.get(a)+1);
      else map.put(a,1);
    }
    for(int i=0;i<m;i++){
      int b = sc.nextInt();
      int c = sc.nextInt();
      if(map.containsKey(c))map.put(c,map.get(c)+b);
      else map.put(c,b);
    }
    long result = 0;
    int res = n;
    while(true){
      Map.Entry<Integer,Integer> entry = map.pollLastEntry();
      long key = entry.getKey();
      long value = entry.getValue();
      if(res>value){
        res-=value;
        result+=value*key;
      }else{
        result+=res*key;
        break;
      }
    }
    System.out.println(result);
  }
}