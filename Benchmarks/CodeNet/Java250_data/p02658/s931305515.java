import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    for(int i = 0; i < N; i++){
      long a = Long.parseLong(S[i]);
      if(a == 0){
        System.out.println(0);
        return;
      }
    }
    BigDecimal now = new BigDecimal("1");
    BigDecimal max = new BigDecimal("1000000000000000000");
    for(int i = 0; i < N; i++){
      BigDecimal A = new BigDecimal(S[i]);
      now = now.multiply(A);
      if(now.compareTo(max) == 1){
        now = new BigDecimal("-1");
        break;
      }
    }
    System.out.println(now.longValue());
  }
}
