import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    String[] a = N.split("");

    String msg = "No";
    if (a[0].equals(a[2])) {
      msg = "Yes";
    }

    System.out.println(msg);

  }
}
