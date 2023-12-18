import java.util.*;

public class Main {
  public static void print(String s, int a, int b) {
    System.out.println(s.substring(a, b + 1));
  }
  public static String reverse(String s, int a, int b) {
    String[] arr = s.split("");
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < a; i++) {
      sb.append(arr[i]);
    }
    for(int i = b; i > a - 1; i--) {
      sb.append(arr[i]);
    }
    for(int i = b + 1; i < s.length(); i++) {
      sb.append(arr[i]);
    }
    return sb.toString();
  }
  public static String replace(String s, String p, int a, int b) {
    String q = s.substring(0, a);
    String r = s.substring(b + 1);
    return q + p + r;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int q = sc.nextInt();
    for(int i = 0; i < q; i++) {
      String order = sc.next();
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(order.equals("print")) {
        print(str, a, b);
      } else if(order.equals("reverse")) {
        str = reverse(str, a, b);
      } else {
        String p = sc.next();
        str = replace(str, p, a, b);
      }
    }
  }
}

