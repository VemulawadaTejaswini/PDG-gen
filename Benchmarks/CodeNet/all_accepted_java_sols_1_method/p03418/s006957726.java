import java.util.*;
import java.*;
class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);



      long N = Long.parseLong(scan.next());
      long K = Long.parseLong(scan.next());



      long count = 0;

      for(long i = K + 1; i <= N; i++){
          long p = N / i;
          long r = N % i;
          count += (i - K) * p + Math.max(r - K + 1, 0);
          }

      if(K == 0){
         count = N * N;
         }
      System.out.println(count);
   }
}
