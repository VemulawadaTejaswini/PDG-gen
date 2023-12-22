import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = sc.next();
    int cnt = 0;
    int os = 0;

    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == 'a') {
        if (cnt < a + b) {
          System.out.println("Yes");
          cnt++;
        } else {
          System.out.println("No");
        }
      } else if (s.charAt(i) == 'b') {
        os++;
        if (cnt < a + b && os <= b) {
          System.out.println("Yes");
          cnt++;
        } else {
          System.out.println("No");
        }
      } else {
        System.out.println("No");
      }
    }

  }
}