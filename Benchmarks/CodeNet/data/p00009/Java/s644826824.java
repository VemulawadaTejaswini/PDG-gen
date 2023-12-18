import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String line;
      int num;
      int result;
      int primeMax;
      List<Integer> prime = new ArrayList<>(); 
      while(true) {

        if( ((line = br.readLine()) == null) || line.isEmpty() ) break;

        num = Integer.parseInt(line);
        if( num == 0 || num == 1) {
          result = 0;
          System.out.println(result);
          continue;
        }
        
        result = 0;
        prime.add(2);
        primeMax = 2;
        result += 1;

        for ( int i = 3; i <= num; i+=2 ) {
          if( isPrime(i,prime) ) {
            if( i > primeMax ) prime.add(i);
            result += 1;
          }
        }
        System.out.println(result);
      }
    }
  }

  public static boolean isPrime(int num,List<Integer> prime) {
    int k = Double.valueOf( Math.sqrt(num) ).intValue();
    for(Integer i: prime) {
      if ( num % i == 0 ) return false;
      if ( i > k ) return true;
    }
    return true;
  }
}
