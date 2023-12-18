import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    long n = scan.nextInt();
    long m = scan.nextInt();
    long sum = 0;

    for (int i = 0; i < m; i++) {
      sum += scan.nextInt();
    }
    if (n >= sum) {
      System.out.println(n - sum);
    } else {
      System.out.println(-1);
    }
  }

}