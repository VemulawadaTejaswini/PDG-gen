import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    int N = Integer.parseInt(sc.next());
    String ans = "";
    for(int i = 0; i < S.length(); i+=N){
      String T = String.valueOf(S.charAt(i));
      ans = ans+T;
    }
    
    System.out.println(ans);
  }
}