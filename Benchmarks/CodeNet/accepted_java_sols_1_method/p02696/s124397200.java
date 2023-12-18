import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long A = scan.nextLong();
    long B = scan.nextLong();
    long N = scan.nextLong();
    scan.close();

    System.out.println(B>N ? (int)Math.floor(A*N/B) : (int)Math.floor(A*(B-1)/B));
  }
}