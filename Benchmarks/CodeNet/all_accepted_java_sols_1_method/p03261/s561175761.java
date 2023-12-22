import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    ArrayList<String> list = new ArrayList<String>();
    list.add(sc.next());

    for (int i = 1; i < n; i++) {
      String pre = list.get(i - 1);
      String s = sc.next();
      if (list.contains(s) || (s.charAt(0) != pre.charAt(pre.length() - 1))) {
        System.out.println("No");
        return;
      } else {
        list.add(s);
      }
    }

    System.out.println("Yes");

  }
}