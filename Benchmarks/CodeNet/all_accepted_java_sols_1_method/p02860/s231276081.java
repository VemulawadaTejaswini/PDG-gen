import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String s = sc.nextLine();
    sc.close();
    if (n % 2 == 1) {
      System.out.println("No");
      return;
    }
    for (int i = 0; i < n / 2; i++) {
      char c1 = s.charAt(i);
      char c2 = s.charAt(i + n / 2);
      if (c1 != c2) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}