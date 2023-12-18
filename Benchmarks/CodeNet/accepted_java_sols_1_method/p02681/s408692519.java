import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int len = s.length();
    if(s.substring(0,len).equals(t.substring(0,len))){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
