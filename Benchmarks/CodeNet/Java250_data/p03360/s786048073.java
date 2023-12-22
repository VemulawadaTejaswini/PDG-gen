import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();

    int max = Math.max(Math.max(a, b), c);

    System.out.println(((a + b + c) - max) + (max * (int) Math.pow(2, k)));

  }
}