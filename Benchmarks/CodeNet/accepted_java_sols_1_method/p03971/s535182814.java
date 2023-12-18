import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = sc.next();
    int ok = a + b;
    int ok_b = b;
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == 'a' && ok != 0) {
        System.out.println("Yes");
        --ok;
      } else if (s.charAt(i) == 'b' && ok != 0 && ok_b != 0) {
        System.out.println("Yes");
        --ok_b;
        --ok;
      } else {
        System.out.println("No");
      }
    }
    sc.close();
  }
}
