import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    if(s.length()<=3)System.out.println("No");
    else{
      if(s.substring(0,4).equals("YAKI"))System.out.println("Yes");
      else System.out.println("No");
    }
  }
}