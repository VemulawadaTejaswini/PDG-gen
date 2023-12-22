import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Map<String , Integer> map = new HashMap<String , Integer>();
    int plusCard = sc.nextInt();
    
    for(int i = 0 ; i < plusCard ; i++){  //プラスカードの値をセットに入れる
      String fruit = sc.next();
      if(map.containsKey(fruit)){
        map.replace(fruit , map.get(fruit)+1);
      }else{
        map.put(fruit , 1);
    }
}
    int minusCard = sc.nextInt();
    
    for(int i = 0 ; i < minusCard ; i++){  //マイナスカードの値を影響させる
      String fruit = sc.next();
      if(map.containsKey(fruit)){
        map.replace(fruit , map.get(fruit)-1);
      }else{
        map.put(fruit , -1);
      }
    }
    int max = 0;
    
    for(String key : map.keySet()){
      int token = map.get(key);
      if(token > max){
        max = token;
      }
   }
   System.out.println(max);
 }
}