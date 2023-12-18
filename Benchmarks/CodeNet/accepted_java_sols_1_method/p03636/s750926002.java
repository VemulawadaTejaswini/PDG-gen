import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int n = S.length()-2;
    System.out.println(S.substring(0,1)+String.valueOf(n)+S.substring(n+1,n+2));
  }
  

  
}