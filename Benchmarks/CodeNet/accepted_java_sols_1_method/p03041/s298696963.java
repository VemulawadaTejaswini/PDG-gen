import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();
    String sm = s.substring(0,k-1);
    String sa = s.substring(k,s.length());
    String ss = s.substring(k-1,k).toLowerCase();
    System.out.println(sm + ss + sa);
  }
}
