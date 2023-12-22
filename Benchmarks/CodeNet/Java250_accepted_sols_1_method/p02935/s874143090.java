import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int v[] = new int[N];
    
    for(int i=0; i<N; i++) {
      v[i] = sc.nextInt();
    }
    Arrays.sort(v);
    
    String newV[] = new String[N-1];
    double sum01 = ((double)v[0]/2 + (double)v[1]/2);
    newV[0] = String.valueOf(sum01);
    if(N>1) {
      for(int j=1; j<N-1; j++) {
        String val1 = newV[j-1];
        String val2 = String.valueOf(v[j+1]);
        BigDecimal bd1 = new BigDecimal(val1);
        BigDecimal bd2 = new BigDecimal(val2);
        BigDecimal sum =bd1.add(bd2);
        BigDecimal two = new BigDecimal(2.0);
        BigDecimal result = sum.divide(two);
        newV[j] = result.toString();
    	}
    }
    
    System.out.println(newV[N-2]);
  }
}