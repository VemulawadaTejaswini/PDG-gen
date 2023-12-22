import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int n = sc.nextInt();
    String s = sc.next();

    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) + n > 'Z'){
        sb.append((char)(s.charAt(i) + n - 'Z' + 'A' - 1));
      } else {
        sb.append((char)(s.charAt(i) + n));
      }
    }

    String ans = sb.toString();

    System.out.println(ans);
  }
}
