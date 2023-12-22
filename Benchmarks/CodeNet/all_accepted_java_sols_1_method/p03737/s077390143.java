import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ans = "";
    for (int i = 0; i < 3; i++){
      String s[] = sc.next().split("");
      ans += s[0].toUpperCase();
    }
    System.out.println(ans);
  }
}
