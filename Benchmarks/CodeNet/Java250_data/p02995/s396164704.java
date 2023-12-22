import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      long A = in.nextLong();
      long B = in.nextLong();
      long C = in.nextLong();
      long D = in.nextLong();
      long countDivideByC = count(A, B, C);
      long countDivideByD = count(A, B, D);
      long countDivideByLCM_CD = count (A, B, C * D / gcd(C, D));
      
      System.out.println(B - A + 1 - countDivideByC - countDivideByD + countDivideByLCM_CD);
    }
  }

  private static long count (long start, long end, long div) {
    return end / div - start / div + (start % div == 0 ? 1 : 0);
  }

  private static long gcd (long a, long b) {
    return b == 0 ? a : gcd(b, a % b);
  }
}