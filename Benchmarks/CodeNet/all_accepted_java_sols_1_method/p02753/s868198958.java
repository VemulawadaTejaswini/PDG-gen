import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String res = "";
    String S = sc.next();

      if(S.charAt(0)==S.charAt(1) && S.charAt(1)==S.charAt(2)){
        res = "No";
      }else{
        res ="Yes";
    }
    System.out.println(res);
  }
}