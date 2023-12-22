import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long A = scan.nextLong();
    long B = scan.nextLong();
    scan.close();

    if(12.5*A < 10*(B+1) && 10*B < 12.5*(A+1)) {
      System.out.println(String.format("%.0f", 12.5*A < 10*B ? 10*B : 12.5*A));
    }
    else {
      System.out.println(-1);
    }
  }
}