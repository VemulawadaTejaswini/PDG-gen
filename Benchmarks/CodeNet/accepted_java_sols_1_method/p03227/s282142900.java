import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int leng = s.length();
    StringBuffer str = new StringBuffer(s);
    String ss = str.reverse().toString();
    if(leng == 2){
      System.out.println(s);
    }else{
      System.out.println(ss);
    }
    
  }
}