import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int len = s.length();

    while (true) {
      len -= 2;
      s = s.substring(0, len);
      int half = len / 2;
      if (s.substring(0, half).equals(s.substring(half, len))) {
        System.out.println(len);
        return;
      }
    }
  }

}