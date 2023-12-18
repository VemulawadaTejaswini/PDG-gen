import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      final int numMax = 1_000_000;
      String line;
      int num;
      int result;

      int[] prime = new int[100_000];
      prime[0] = 2;
      int[] numOfPrimes = new int[numMax+2];
      numOfPrimes[0] = 0; numOfPrimes[1] = 0; numOfPrimes[2] = 1;

      for ( int i=3, j=1; i < numMax; i+=2 ) {
        if( isPrime(i,prime) ) {
          prime[j++] = i;
        }
        numOfPrimes[i] = numOfPrimes[i+1] = j;
      }

      while(true) {

        if( ((line = br.readLine()) == null) || line.isEmpty() ) break;

        num = Integer.parseInt(line);        
        System.out.println(numOfPrimes[num]);
      }
    }
  }

  public static boolean isPrime(int num,int[] prime) {
    int k = Double.valueOf( Math.sqrt(num) ).intValue();
    for(int i: prime) {
      if ( num % i == 0 ) return false;
      if ( i > k ) return true;
    }
    return true;
  }
}
