import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();
    String ans = "";
    for(int i = 0; i < s.length(); i++) {
      String str = String.valueOf(s.charAt(i));
      if(i == (k - 1)) str = str.toLowerCase();
      ans += str; 
    }
    System.out.println(ans);
  }
}