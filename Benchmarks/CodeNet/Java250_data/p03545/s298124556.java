import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int a = Character.getNumericValue(s.charAt(0));
    int b = Character.getNumericValue(s.charAt(1));
    int c = Character.getNumericValue(s.charAt(2));
    int d = Character.getNumericValue(s.charAt(3));
    char[] op = { '+', '-' };
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        for (int k = 0; k < 2; k++) {
          int tmp = a;
          if (i == 0) {
            tmp += b;
          } else {
            tmp -= b;
          }
          if (j == 0) {
            tmp += c;
          } else {
            tmp -= c;
          }
          if (k == 0) {
            tmp += d;
          } else {
            tmp -= d;
          }
          if (tmp == 7) {
            System.out.println(a + "" + op[i] + "" + b + "" + op[j] + "" + c + "" + op[k] + "" + d + '=' + 7);
            return;
          }
        }
      }
    }

  }
}