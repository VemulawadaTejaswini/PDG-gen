import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Map<String,String> map = new HashMap<>();
    String[] input = sc.next().split("");
    for(String c : input){
      if(map.get(c)!=null ){
        System.out.println("no");
        return;
      }else{
        map.put(c,"add");
      }
    }
    System.out.println("yes");
  }
}