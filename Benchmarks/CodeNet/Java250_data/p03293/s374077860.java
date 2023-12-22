import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int n = s.length();
    StringBuilder buf = new StringBuilder();
    for (int i = 0;i<n;i++) {
      buf.append(t.substring(i));
      if (i>0) {
        buf.append(t.substring(0,i));
      }
      if (s.equals(buf.toString())) {
        System.out.println("Yes");
        return;
      }
      buf.delete(0,n);
    }
    System.out.println("No");
  }
}
