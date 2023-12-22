import java.util.*;
import java.math.BigDecimal;

public class Main {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    String A[] = new String[N];
    BigDecimal C = new BigDecimal("1000000000000000000");
    String B = "";
    
    for(int i=0; i<N; i++) {
      A[i] = sc.next();
    }
    Arrays.sort(A);
    BigDecimal z = new BigDecimal("0");
    BigDecimal b = new BigDecimal("1");
    for(int j=0; j<N; j++) {
      BigDecimal b1 = new BigDecimal(A[j]);
      b= b.multiply(b1);
      if(b.compareTo(z) == 0) {
        break;
      } else if(b.compareTo(C) > 0) {
        b = new BigDecimal("-1");
        break;
      }
    }
    System.out.println(b);
  }
}