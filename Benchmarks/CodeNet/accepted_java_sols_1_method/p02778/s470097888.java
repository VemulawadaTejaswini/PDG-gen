import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String ans ="x";
    for(int i = 0; i < S.length()-1; i++){
     ans += "x";
    }
    System.out.println(ans);
}
}
