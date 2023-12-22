
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long P = 1000000007;
    long N = sc.nextLong();
    long K = sc.nextLong();
    
    long ans =0;
    for(long i=K;i<=N+1;i++){
      //i番目の個数は(2*N+3-i)*i/2-(i-1)*i/2+1個
      ans=(ans+((((2*N-i+1)*i)/2)-(((i-1)*i)/2)+1)%P)%P;
    }



    System.out.println(ans);


  }

}
 