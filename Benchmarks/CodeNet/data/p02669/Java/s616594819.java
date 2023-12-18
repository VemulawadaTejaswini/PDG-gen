import java.util.Scanner;

public class Main {
  static long num;
  static long cnt;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();

    // todo for
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();
    num = 0;
    cnt = 0;
    num = calcDPlus(num); // ここまで固定

    // todo for
    long testNumBefore = num;
    long testNumAfterA = calcA(testNumBefore);
    long testNumAfterB = calcB(testNumBefore);
    long testNumAfterC = calcC(testNumBefore);
    long testNumAfterDPlus = calcDPlus(testNumBefore);
    long costA = (testNumAfterA - testNumBefore) / A;
    long costB = (testNumAfterB - testNumBefore) / B;
    long costC = (testNumAfterC - testNumBefore) / C;
    long costD = (testNumAfterDPlus - testNumBefore) / D;

    num = calcA();
  }

  private static long calcA(long calc) {
    return calc * 2;
  }

  private static long calcB(long calc) {
    return calc * 3;
  }

  private static long calcC(long calc) {
    return calc * 5;
  }

  private static long calcDPlus(long calc) {
    return calc + 1;
  }

  private static long calcDMinus(long calc) {
    return calc - 1;
  }
}
