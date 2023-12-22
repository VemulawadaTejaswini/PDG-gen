import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int out = 0;
    if (s.equals("SUN")) {
      out = 7;
    } else if (s.equals("MON")) {
      out = 6;
    } else if (s.equals("TUE")) {
      out = 5;
    } else if (s.equals("WED")) {
      out = 4;
    } else if (s.equals("THU")) {
      out = 3;
    } else if (s.equals("FRI")) {
      out = 2;
    } else if (s.equals("SAT")) {
      out = 1;
    }
    System.out.println(out);
  }
}