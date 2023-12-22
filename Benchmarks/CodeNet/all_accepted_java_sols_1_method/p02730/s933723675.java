import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int N = S.length();
    String case1 = S.substring(0, N/2);
    String case2 = S.substring((N+3)/2-1, N);
    if(case1.equals(case2)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
  