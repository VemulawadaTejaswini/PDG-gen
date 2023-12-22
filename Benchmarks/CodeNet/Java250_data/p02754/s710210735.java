import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long N = scan.nextLong();
    long A = scan.nextLong();
    long B = scan.nextLong();
    scan.close();

    long count = N / (A + B);
    long amari = N % (A + B);

    System.out.println(A * count + (A>=amari ? amari : A));
  }
}