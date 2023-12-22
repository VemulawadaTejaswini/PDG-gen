import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        // input
        int j = 0;
        int max = 100000;
        int max_prime = 0;
        int N = Integer.parseInt(br.readLine());

        // for output
        int result = 0;

        // for prime_table
        boolean[] prime_table = new boolean[max + 1];
        Arrays.fill(prime_table, true);
        prime_table[0] = prime_table[1] = false;

        for(int i = 2; i <= max; i++){
          if(prime_table[i]){
            j = i + i;
            while(j <= max){
              prime_table[j] = false;
              j = j + i;
            }
          }
        }

        for(int i = max; i > 1; i--){
          if(prime_table[i]){
            max_prime = i;
            break;
          }
        }

        // algorithm
        for(int t = N; t <= max; t++){
          if(N > max_prime){
            result = 100003;
            break;
          }else{
            if(prime_table[t] == false){
              continue;
            }else{
              result = t; 
              break;
            }
          }
        }
    
        System.out.println(result);

      }
    }
}