import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String str = scan.next();
    int q = scan.nextInt();

    for (int i = 0; i < q; i++) {

      String order = scan.next();

      if (order.equals("print")) {
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(str.substring(a, b + 1));
      } else if (order.equals("reverse")) {
        int a = scan.nextInt();
        int b = scan.nextInt();
        String tmp = str.substring(0, a);
        for (int j = b; j >= a; j--) {
          tmp = String.join("", tmp, Character.toString(str.charAt(j)));
        }
        str = String.join("", tmp, str.substring(b + 1, str.length()));
      } else {
        int a = scan.nextInt();
        int b = scan.nextInt();
        String p = scan.next();
        str = String.join("", str.substring(0, a), p, str.substring(b + 1, str.length()));
      }

    }

  }

}

