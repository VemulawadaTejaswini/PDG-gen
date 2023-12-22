import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    if(s.length() == 2)
      System.out.println(s);
    else{
      StringBuffer sb = new StringBuffer(s);
      s = sb.reverse().toString();
      System.out.println(s);
    }
  }
}