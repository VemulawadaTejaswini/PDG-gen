import java.util.*;
import java.math.*;

public class Main {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    BigDecimal[] A = new BigDecimal[N+1];
    BigDecimal a = new BigDecimal(1);
    BigDecimal b = new BigDecimal(Math.pow(10,18));
    BigDecimal c = new BigDecimal(0);
    int check =0;
    for (int i =1; i<=N; i++) {
      A[i] = sc.nextBigDecimal();
      if (A[i].compareTo(c) == 0) {
        a = new BigDecimal(0);
        break;
      }
    }
    if (a.compareTo(c) != 0) {
      for (int i =1; i<=N; i++) {
        a = a.multiply(A[i]);
        if (a.compareTo(b) >0) {
          a = new BigDecimal(1);
          check++;
        }
      }
    }
    if (a.compareTo(c) == 0) {
      System.out.println(0);
    } else if (check != 0) {
      System.out.println(-1);
    } else {
      System.out.println(a);
    }
  }
}