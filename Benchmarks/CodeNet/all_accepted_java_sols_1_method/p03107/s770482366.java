import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int zero = 0;
    int one = 0;
    char[] ch = new char[str.length()];
    for(int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
      if(ch[i] == '0') zero++;
      else if(ch[i] == '1') one++;
    }
    int ans = 2 * Math.min(zero, one);
    System.out.println(ans);
  }
}
