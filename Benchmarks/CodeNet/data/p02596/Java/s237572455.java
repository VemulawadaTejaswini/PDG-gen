import java.util.*;
import java.math.*;

public class Main {
  
  public static void main(String[] args) {
    
    try (Scanner scan = new Scanner(System.in)) {
      
      int k = scan.nextInt();
      
      if (k % 2 == 0) {
      	System.out.println("-1");
        return;
      }
      
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < String.valueOf(k).length(); i++) {
      	sb.append("7");
      }
      
      int seven = Integer.parseInt(sb.toString());
      if (seven < k) {
      	sb.append("7");
      }
      
      String result = calc(new BigDecimal(k), sb.toString());
      
      if (result == null) {
      	System.out.println("-1");
        return;
      }
      
      System.out.println(result);
    }
  }
    
  private static String calc(BigDecimal k, String seven) {
    
    BigDecimal bgSeven = new BigDecimal(seven);
    
  	if (bgSeven.remainder(k)
        .compareTo(BigDecimal.ZERO) == 0) {
    	return seven;
    }

    return calc(k, seven + "7");
  }
}