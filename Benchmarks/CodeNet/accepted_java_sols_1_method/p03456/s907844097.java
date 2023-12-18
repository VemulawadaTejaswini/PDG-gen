import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String s = a + b;
    int ab = new Integer(s).intValue();
    double k = Math.sqrt(ab);
    int l = (int)Math.sqrt(ab);
    if(k == l){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}