import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    S = S.replaceAll("x","");
    System.out.println(700+(S.length())*100);
  }
}
    