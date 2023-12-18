import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String,Integer> su = new LinkedHashMap<String,Integer>();
    su.put("1",0);
    for(int i = 2; i <= n; i++){
    	String num = String.valueOf(i);
      su.put(num,0);
    }
    for(int i = 0; i < n-1; i++){
      String j = sc.next();
      int temp = su.get(j) + 1;
      su.put(j,temp);
    }
    sc.close();
    for(String ans : su.keySet()){
      System.out.println(su.get(ans));
    }
  }
}