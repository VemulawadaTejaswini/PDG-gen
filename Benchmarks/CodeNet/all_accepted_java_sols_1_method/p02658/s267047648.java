import java.util.*;
import java.math.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    BigInteger[] A = new BigInteger[N];
    BigInteger sum = BigInteger.ONE;
    
    for(int i=0; i<N; i++){
      A[i] = sc.nextBigInteger();
      if(A[i].compareTo(BigInteger.ZERO) == 0){
        System.out.println(0);
        System.exit(0);
      }
    }
    
    for(int i=0; i<N; i++){
      sum = sum.multiply(A[i]);
      if(sum.compareTo(new BigInteger("1000000000000000000")) == 1){
        System.out.println(-1);
        System.exit(0);
      }
    }
    
    System.out.println(sum);
  }
}