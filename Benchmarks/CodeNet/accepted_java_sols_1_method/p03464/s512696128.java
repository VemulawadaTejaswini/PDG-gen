import java.util.*;
public class Main {
  public static void main(String...args) {
	final Scanner sc = new Scanner(System.in);
    final int K = sc.nextInt();
    final int[] A = new int[K];
    for(int i = 0; i < K; i++)
      A[i] = Integer.parseInt(sc.next());
    long lo = 2;
    long hi = 2;
    for(int i = K - 1; i >= 0; i--) {
      long newLo = lo / A[i] * A[i];
      if(newLo < lo)
        newLo += A[i];
      final long newHi = hi / A[i] * A[i] + A[i] - 1;
      if(newLo > newHi) {
      	System.out.println(-1);
        return;
      }
      lo = newLo;
      hi = newHi;
    } 
    System.out.println(lo + " " + hi);
  }
}