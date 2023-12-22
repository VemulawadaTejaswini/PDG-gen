import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String first = str.substring(0, 1);
    String fin = str.substring(str.length() - 1, str.length());
    
    int len = str.length() - 2;
    
    
    System.out.println(first + len + fin);
  }
}