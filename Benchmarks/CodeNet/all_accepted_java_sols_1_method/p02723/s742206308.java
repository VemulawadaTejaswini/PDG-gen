import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s ="";
    if(sc.hasNext())
    s= sc.next();
    if(s.length()==6 && s.charAt(2)==s.charAt(3) && s.charAt(4)==s.charAt(5)){
      System.out.println("Yes");
      return;
    }
    System.out.println("No");
  }
}