import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.math.BigInteger;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    BigInteger A[] = new BigInteger[N];
    BigInteger big = new BigInteger("1000000000000000000");
    BigInteger result = BigInteger.ONE;
    int K = 0;
    for (int i = 0;i < N;i++) {
      A[i] = scan.nextBigInteger();
      if (A[i] == 0) {
        K = i;
      }
    }
    if (K > 0) {
      for (int i = K;i < N;i++) {
        result = result.multiply(A[i]);
      }
    }
    else{
      for (int i = 0;i < N;i++) {
        result = result.multiply(A[i]);
      }
    }
    if (result.compareTo(big) > 0) {
      System.out.println(-1);
      return;
    }
    System.out.println(result);
  }
}