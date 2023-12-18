import java.math.BigInteger;
 
public class Main{
  
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    BigInteger ans  = BigInteger.ONE;
    long l = (long)Math.pow(10,18);
    BigInteger L = BigInteger.valueOf(l);

    while(sc.hasNext()){
      long a = sc.nextLong();
      if (a == 0) {
        System.out.println(0);
        return;        
      }
      ans = ans.multiply(BigInteger.valueOf(a));
      if(ans.compareTo(L) > 0){
        System.out.println(-1);
        return;
      }
    }
    System.out.println(ans);
  }
}
