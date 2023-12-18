import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    String s = Integer.toString(n);

    char c = s.charAt(s.length() - 1);

    if (c == '3') {
      System.out.println("bon");
    } else if ((c == '0') || (c == '1') || (c == '6') || (c == '8')) {
      System.out.println("pon");
    } else {
      System.out.println("hon");
    }

  }

}