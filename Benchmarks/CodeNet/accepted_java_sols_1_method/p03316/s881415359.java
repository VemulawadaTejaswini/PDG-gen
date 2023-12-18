import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = 0, sn = 0;
    for(int i = 0; i < str.length(); i++) {
      int a = str.charAt(i) - '0';
      n = a + n * 10;
      sn += a;
    }
    System.out.println(((n % sn == 0) ? "Yes" : "No"));
  }
}