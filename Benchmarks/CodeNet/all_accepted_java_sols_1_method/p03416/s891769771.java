import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int cnt = 0;

    for (int i = a; i <= b; i++) {
      String s = Integer.toString(i);
      StringBuilder bld = new StringBuilder(s.substring(3));
      String rev = bld.reverse().toString();
      if (s.substring(0, 2).equals(rev)) {
        cnt++;
      }
    }

    System.out.println(cnt);

  }
}