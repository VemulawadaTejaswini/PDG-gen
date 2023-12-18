import java.util.*;
import java.math.BigInteger;
 
public class Main{
  
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    long[] list = new long[num];
    for(int i = 0; i < num ; ++i){
      list[i] = sc.nextLong();
    }
    
    if(num>=2 && num<=100000L){
      BigInteger ans  = BigInteger.ONE;
      for(int i = 0; i < num; ++i){
        long a = list[i];
        ans = ans.multiply(BigInteger.valueOf(a));
      }
      long l = 1000000000000000000L;
      BigInteger L = BigInteger.valueOf(l);
    
      if(ans.compareTo(L) < 0){
        System.out.println(ans);
      }else{
        System.out.println(-1);
      }
    }else{
      System.out.println("入力条件に違反しています");
    }
  }  
}