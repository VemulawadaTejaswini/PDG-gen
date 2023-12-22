import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long S[] = new long[3];
    S[0] = sc.nextLong();
    S[1] = sc.nextLong();
    S[2] = sc.nextLong();
    Arrays.sort(S);
    long s1 = (int)S[2] / 2 * S[1] * S[0];
    long sAll = S[0] * S[1] * S[2];
    long s2 = sAll - s1;
    System.out.print(s2 - s1);
  }
}