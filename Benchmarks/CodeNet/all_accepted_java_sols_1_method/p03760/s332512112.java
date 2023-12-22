import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String o = sc.next();
    String e = sc.next();
    String ans = "";
    for (int i = 0; i < e.length(); i++) {
      ans += o.charAt(i);
      ans += e.charAt(i);
    }

    if (o.length() != e.length()) {
      ans += o.charAt(o.length() - 1);
    }

    System.out.println(ans);

  }
}