import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = Long.parseLong(sc.next());
    long k = Long.parseLong(sc.next());
    long d = Long.parseLong(sc.next());
    
    long ans = x;
    long divAns = x/d;

    if(k < Math.abs(divAns)){
      if(x > 0){
        ans = x - d * k;
      }else{
        ans = x + d * k;
      }
      
      System.out.println(Math.abs(ans));
      sc.close();
      return;
    }

    k = k - Math.abs(divAns);
    ans = x - d * divAns;

    if(k % 2 != 0){
      if(ans > 0){
        ans = ans - d;
      }else{
        ans = ans + d;
      }
    }

    System.out.println(Math.abs(ans));
   
    sc.close();
    return;
  }
  
}
