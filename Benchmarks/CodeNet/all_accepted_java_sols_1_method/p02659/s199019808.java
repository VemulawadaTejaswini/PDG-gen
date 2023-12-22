import java.util.*;
import java.math.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = Long.parseLong(sc.next().replace(".",""));    
    BigDecimal big = new BigDecimal(x).multiply(new BigDecimal(y).divide(new BigDecimal("100")));
    String res = big.toString();
    if(res.contains(".")){
   		res = res.substring(0, res.indexOf("."));
    }
    System.out.println(res);
  }
 
}