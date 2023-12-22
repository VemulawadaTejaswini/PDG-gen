import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    if(n%2==1){
      System.out.println("No");
      return;
    }
    String ss = s.substring(n/2,n);
    s = s.substring(0,n/2);
    if(s.equals(ss)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
