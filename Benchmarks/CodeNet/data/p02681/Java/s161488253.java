import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String c = sc.next();
    int l = c.length();
    String g = c.substring(0,l-1);
    if(s.equals(g))
      System.out.println("Yes");
      else
            System.out.println("No");
       }
       }