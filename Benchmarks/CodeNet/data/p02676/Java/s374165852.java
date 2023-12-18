import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String s = sc.next();
    int len = s.length();
    if(len <= k){
      System.out.println(s);
    }else{
      s = s.substring(0,k);
      System.out.println(s + "...");
    }
  }
}
