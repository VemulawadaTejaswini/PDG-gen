import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String ans = "Yes";

    if(s.charAt(2) != s.charAt(3)){
      ans = "No";
    } if(s.charAt(4) != s.charAt(5)){
      ans = "No";
    }

    System.out.println(ans);
  }
}
