import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    BigInteger[] A = new BigInteger[N];
    for (int i =0; i<N; i++) {
      A[i] = sc.nextBigInteger();
    }
    Arrays.sort(A);
    BigInteger a = BigInteger.ZERO;
    BigInteger b = BigInteger.ZERO;
    int p = 100001;
    for (int i =N-1; i>0; i--) {
      if (A[i].equals(A[i-1])) {
        a = A[i];
        p = i;
        break;
      }
    }
    for (int i =N-1; i>0; i--) {
      if (i != p && i != p-1 && A[i].equals(A[i-1])) {
        b = A[i];
        break;
      }
    }
    System.out.println(a.multiply(b));  
  }
}