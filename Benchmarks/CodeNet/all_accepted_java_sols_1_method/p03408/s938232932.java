import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String,Integer> blue = new HashMap<String,Integer>();
    for(int i = 0; i < n; i++){
      String str = sc.next();
      if(blue.containsKey(str)){
        int count = blue.get(str)+1;
        blue.put(str,count);
      }
      else{
        blue.put(str,1);
      }
    }
    int m = sc.nextInt();
    Map<String,Integer> red = new HashMap<String,Integer>();
    for(int i = 0; i < m; i++){
      String str = sc.next();
      if(red.containsKey(str)){
        int count = red.get(str) + 1;
        red.put(str,count);
      }
      else{
        red.put(str,1);
      }
    }
    int ans = 0;
    for(String i:blue.keySet()){
      int temp;
      if(red.containsKey(i)){
        temp = blue.get(i) - red.get(i);
      }
      else{
        temp = blue.get(i);
      }
      if(ans < temp){
        ans = temp;
      }
    }
    if(ans <= 0){
      System.out.println(0);
    }
    else{
      System.out.println(ans);
    }
  }
}