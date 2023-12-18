import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    String S = sc.next();

    char[] ch = S.toCharArray();

    ArrayList list = new ArrayList();
    for (int i=0; i<ch.length; i++) {
      list.add(ch[i]);
    }

    for (int i=0; i<=list.size()-2; i++) {
      if (i<0) i = 0;
      if (list.get(i) != list.get(i+1)) {
        list.remove(i+1);
        list.remove(i);
        i -= 2;
      }
    }

    System.out.println(ch.length - list.size());

  }
}