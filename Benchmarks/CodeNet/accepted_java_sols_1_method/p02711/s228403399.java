import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    s = s.replace("7","");
    if(s.length() != 3){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
