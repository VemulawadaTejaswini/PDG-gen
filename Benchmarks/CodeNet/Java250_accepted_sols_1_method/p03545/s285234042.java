import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] abcd = sc.next().toCharArray();
    int a = abcd[0] - '0';
    int b = abcd[1] - '0';
    int c = abcd[2] - '0';
    int d = abcd[3] - '0';
    String ans = "";
    if (a + b + c + d == 7) {
      ans = "" + a + "+" + b + "+" + c + "+" + d + "=7";
    }
    if (a - b + c + d == 7) {
      ans = "" + a + "-" + b + "+" + c + "+" + d + "=7";
    }
    if (a + b - c + d == 7) {
      ans = "" + a + "+" + b + "-" + c + "+" + d + "=7";
    }
    if (a + b + c - d == 7) {
      ans = "" + a + "+" + b + "+" + c + "-" + d + "=7";
    }
    if (a + b - c - d == 7) {
      ans = "" + a + "+" + b + "-" + c + "-" + d + "=7";
    }
    if (a - b + c - d == 7) {
      ans = "" + a + "-" + b + "+" + c + "-" + d + "=7";
    }
    if (a - b - c + d == 7) {
      ans = "" + a + "-" + b + "-" + c + "+" + d + "=7";
    }
    if (a - b - c - d == 7) {
      ans = "" + a + "-" + b + "-" + c + "-" + d + "=7";
    }
    System.out.println(ans);
  }
}