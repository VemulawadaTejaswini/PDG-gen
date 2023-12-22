import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();
    System.out.println(Math.min(Math.min(p + q, q + r), r + p));

  }
}