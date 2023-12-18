import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ch = sc.next();
    ch = ch.replaceAll("0", "");
    System.out.println(ch.length());
  }
}