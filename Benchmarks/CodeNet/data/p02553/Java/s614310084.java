import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextInt();
    long b = sc.nextInt();
    long c = sc.nextInt();
    long d = sc.nextInt();

    long ac = a * c;
    long ad = a * d;
    long bc = b * c;
    long bd = b * d;

    System.out.println(Math.max(Math.max(ac, ad), Math.max(bc, bd)));
  }
}