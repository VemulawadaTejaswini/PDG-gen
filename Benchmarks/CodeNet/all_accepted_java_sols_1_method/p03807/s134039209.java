import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 0;
    long rep = sc.nextLong();

    for (int i = 1; i < n; i++) {
      sum += sc.nextLong();
    }

    if (sum % 2 == rep % 2) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}