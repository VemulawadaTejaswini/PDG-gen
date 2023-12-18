import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    char[] c = s.toCharArray();
    String ans = "No";

    Arrays.sort(c);
    if((c[0] == c[1]) && (c[2] == c[3]) && (c[0] != c[3])){
      ans = "Yes";
    }

    System.out.println(ans);
  }
}
