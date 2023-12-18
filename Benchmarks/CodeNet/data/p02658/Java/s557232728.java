import java.util.*;
import java.math.BigInteger;
 
public class Main{
  
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean judge = true;
    
    BigInteger ans  = BigInteger.ONE;
    
    long[] list = new long[num];
    for(int i = 0; i < num ; ++i){
      list[i] = sc.nextLong();
      if(list[i] == 0){
        ans  = BigInteger.ZERO;
        judge = false;
      }
    }

      
      long l = 1000000000000000000L;
      for(int i = 0; i < num; ++i){
        long a = list[i];
        if(BigInteger.valueOf(a).compareTo(BigInteger.valueOf(l)) != -1) judge = false;
        if(judge){
          ans = ans.multiply(BigInteger.valueOf(a));
          l /= BigInteger.valueOf(a).longValue();
        }
      }
      
      BigInteger L = BigInteger.valueOf(l);
    
      if(judge || ans.equals(BigInteger.ZERO)){
        System.out.println(ans);
      }else{
        System.out.println(-1);
      }
  }  
}
