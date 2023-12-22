import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    sc.close();

    String res = "No";
    String[] s = S.split("");

    if (s[0].equals(s[1]) && s[2].equals(s[3])) {
      if (!s[0].equals(s[2])){
        res = "Yes";
      }
    }

    if (s[0].equals(s[2]) && s[1].equals(s[3])) {
      if (!s[0].equals(s[1])){
        res = "Yes";
      }
    }

    if (s[0].equals(s[3]) && s[1].equals(s[2])) {
      if (!s[0].equals(s[1])){
        res = "Yes";
      }
    }

    System.out.println(res);

  }
  
}