import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     n    = Integer.parseInt(scan.next());

      final int MAX = 100000 + 1;

      int[] count = new int[MAX];
      count[0] = count[1] = count[2] = 0;
      boolean[] primes = new boolean[MAX];

      primes[2] = true;

      for(int i = 3; i < MAX; i += 2){
          primes[i] = true;
          }

      for(int i = 3; i * i < MAX; i += 2){
          if(primes[i]){
             for(int j = i * 2; j < MAX; j += i){
                 primes[j] = false;
                 }
             }
          }
      for(int i = 3; i < MAX; i++){
          if(primes[i] == true){
             if(primes[(i + 1) / 2] == true){
                count[i] = count[i - 1] + 1;
                }
             else{
                 primes[(i + 1) / 2] = false;
                 count[i]            = count[i - 1];
                 }
             }
          else{
              count[i] = count[i - 1];
              }
          }
      //System.out.println(count);

      for(int i = 0; i < n; i++){
          int a   = Integer.parseInt(scan.next());
          int b   = Integer.parseInt(scan.next());
          int cou = 0;

          if(a == b){
             cou = count[a] - count[a - 1];
             System.out.println(cou);
             }
          else{
              cou = count[b] - count[a - 1];
              System.out.println(cou);
              }
          }
   }
}
