import java.util.*;
public class Main{
     public static void main(String[] args){
          Scanner kb = new Scanner(System.in);
          int d = 0, i, j, n, count;
          boolean[] primes;
          
          try{
          while(kb.hasNextLine()){
               n = kb.nextInt();
               
               primes = new boolean[n + 1];
               Arrays.fill(primes, true);
               primes[0] = primes[1] = false;
               
               for (i = 4 ; i < primes.length ; i = i + 2){
                    primes[i] = false;
               }
               
               for (i = 3 ; i * i <= primes.length ; i++) {
                    if (primes[i]) {
                         for (j = i * i ; j < primes.length ; j = j + i){
                              primes[j] = false;
                         }
                    }
               }
               
               count = Arrays.toString(primes).replaceAll("[^t]", "").length();
               
               System.out.println(count);
          }
          }catch(Exception e){}
     }
}