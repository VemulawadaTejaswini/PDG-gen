import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    boolean res = true;
    char[] a = s.toCharArray();
    for(int i = 0; i < a.length; ++i) {
      if((i & 1) == 0) {
        if(a[i] != 'h') res = false;
      } else {
        if(a[i] != 'i') res = false;
      }
    }
    if(a.length % 2 != 0) res = false;
    if(res) System.out.println("Yes");
    else System.out.println("No");
  }
}
