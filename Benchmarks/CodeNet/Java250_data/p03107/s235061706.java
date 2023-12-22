import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int n0 = 0;
    int n1 = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0') {
        n0++;
      } else {
        n1++;
      }
    }

    System.out.println(2 * Math.min(n0, n1));

  }
}