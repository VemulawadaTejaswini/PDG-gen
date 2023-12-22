import java.util.*;


public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    String S = sc.next();
    int B = sc.nextInt();

    if (S.equals("+")){
      int ans = (A + B);
      System.out.println(ans);
    }else {
      int ans = (A - B);
      System.out.println(ans);
    }
  }
}
