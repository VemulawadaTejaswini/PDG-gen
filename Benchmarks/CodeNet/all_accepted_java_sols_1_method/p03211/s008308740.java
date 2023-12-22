import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();

    sc.close();

    String[] s = S.split("");

    int d = 753;

    for (int i = 0; i <= s.length - 3; i++) {

      int v = Integer.valueOf(s[i] + s[i+1] + s[i+2]);

      int d1 = Math.abs(753 - v);
      
      d = Math.min(d, d1);

    }

    System.out.println(d);

  }

}