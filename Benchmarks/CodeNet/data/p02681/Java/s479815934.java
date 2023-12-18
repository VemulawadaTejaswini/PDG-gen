import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    boolean flg = true;

    if(s.getBytes().length <= 0 || s.getBytes().length > 10) {
      flg = false;
    }
    if((s.getBytes().length+1) != t.getBytes().length) {
      flg = false;
    }

    if(flg) {
      if(t.contains(s)) {
        System.out.print("Yes");
      } else {
        System.out.print("No");
      }
    } else {
      System.out.print("No");
    }

    sc.close();
  }
}