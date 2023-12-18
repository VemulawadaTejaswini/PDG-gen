import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    double b = sc.nextDouble();
    double res = a * b;
    res = Math.floor(res);
    long p = (long) res;

    System.out.println(p);

  }
}