import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      String com = sc.next();
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (com.equals("print")) {
        print(str, a, b);
      } else if (com.equals("reverse")) {
        str = reverse(str, a, b);
      } else if (com.equals("replace")) {
        String p = sc.next();
        str = replace(str, a, b, p);
      }
    }
  }
  static void print(String str, int a, int b) {
    System.out.println(str.substring(a, b + 1));
  }
  static String reverse(String str, int a, int b) {
    String str1 = str.substring(0, a);
    String str2 = str.substring(a, b + 1);
    String str3 = str.substring(b + 1);
    StringBuilder sb = new StringBuilder(str2);
    str = str1 + sb.reverse().toString() + str3;
    return str;
  }
  static String replace(String str, int a, int b, String p) {
    StringBuilder sb = new StringBuilder(str);
    sb.replace(a, b + 1, p);
    str = sb.toString();
    return str;
  }
}
