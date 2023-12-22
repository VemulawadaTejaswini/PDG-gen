import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String T = sc.nextLine();
    String t = T.substring(0, T.length()-1);

    if(S.equals(t)){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}