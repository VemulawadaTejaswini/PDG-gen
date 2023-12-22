import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    s = s.replace("A","");
    int len = s.length();
    if(len == 0 || len == 3){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}
