import java.util.*;
 
public class Main {
  public static void main(String[] args){
    //MLE解消できず,他の人の解法をコピー
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    S = S.replaceAll("eraser", "@");
    S = S.replaceAll("erase", "@");
    S = S.replaceAll("dreamer", "@");
    S = S.replaceAll("dream", "@");
    S = S.replaceAll("@", "");
    if (S.length() == 0){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}