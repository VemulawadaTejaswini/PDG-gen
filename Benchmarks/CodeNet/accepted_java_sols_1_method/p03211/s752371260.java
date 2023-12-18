import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int leng = S.length();
    int ans = 999;
    
    for (int i = 0; i < leng - 2; i++) {
      String sub = S.substring(i,i+3);
      int ab = Integer.parseInt(sub);
      if(ans > Math.abs(753-ab)){
        ans = Math.abs(753-ab);
      }
    }
    System.out.println(ans);
  }
}