import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int min = 1000;

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      x -= a;
      min = Math.min(a, min);
    }

    System.out.println(n + (x / min));

  }
}