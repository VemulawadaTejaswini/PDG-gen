import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String SS = S.substring(5,7);
    if(SS.equals("01") || SS.equals("02")||SS.equals("03")||SS.equals("04")) {
      System.out.println("Heisei");
    } else {
      System.out.println("TBD");
    }
  }
}