import java.util.*;


public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String a = "";
      String b = "";
      int ai = 0;
      int bi = 0;
      for (int i = 0; i < s.length(); i++) {
        if (a == "") {
          a = s.substring(i,i+1);
        } else if (a.equals(s.substring(i,i+1))) {
          ai += 1;
        } else if (b == "") {
          b = s.substring(i,i+1);
        } else if (b.equals(s.substring(i,i+1))) {
          bi += 1;
        }
      }
      if (ai == 1 && bi == 1) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
}