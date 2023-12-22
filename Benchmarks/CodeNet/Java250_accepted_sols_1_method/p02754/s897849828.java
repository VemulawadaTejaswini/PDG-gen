import java.util.*;
import java.lang.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    sc.close();
    long C = A + B;
    long div = (N / C) * A;
    long mod = Math.min(N % (A + B), A);

    System.out.println(div + mod);
  }
}