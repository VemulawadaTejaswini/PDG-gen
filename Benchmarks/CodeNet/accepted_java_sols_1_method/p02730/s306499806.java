import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int len = s.length();
    String ans = "Yes";

    for(int i = 0; i < len / 2; i++){
      if(s.charAt(i) != s.charAt((len / 2) - 1 - i)){
        ans = "No";
        break;
      } else if(s.charAt((len / 2) + 1 + i) != s.charAt((len / 2) - 1 - i)){
        ans = "No";
        break;
      }
    }

    System.out.println(ans);
  }
}
