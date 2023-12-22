import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long A = scan.nextLong();
    long B = scan.nextLong();
    long C = scan.nextLong();
    long D = scan.nextLong();
    long CD = leastCommonMultiple(C, D);

    long cStart;
    long dStart;
    long cdStart;
    if (A % C == 0) {
      cStart = A / C;
    } else {
      cStart = A / C + 1;
    }
    if (A % D == 0) {
      dStart = A / D;
    } else {
      dStart = A / D + 1;
    }
    if (A % CD == 0) {
      cdStart = A / CD;
    } else {
      cdStart = A / CD + 1;
    }

    long cEnd = B / C;
    long dEnd = B / D;
    long cdEnd = B / CD;

    long cn = cEnd - cStart + 1;
    long dn = dEnd - dStart + 1;
    long cdn = cdEnd - cdStart + 1;

    long result = B - A + 1 - cn - dn + cdn;

    System.out.println(result);

  }

  private static long leastCommonMultiple(long a, long b) {
    long temp;
    long c = a;
    c *= b;
    while ((temp = a % b) != 0) {
      a = b;
      b = temp;
    }
    return c / b;
  }
}

