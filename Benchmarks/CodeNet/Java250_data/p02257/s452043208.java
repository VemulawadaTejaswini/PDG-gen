import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt( br.readLine() );
      int num;
      int result = 0;

      for (int i=0; i<n; i++) {
        num = Integer.parseInt(br.readLine());
        if (isPrime(num)) result++;
      }
      System.out.println(result);
    }
  }

  public static boolean isPrime(int num) {
    if( num == 2 ) return true;
    if( (num % 2) == 0 ) return false;

    int k = Double.valueOf( Math.sqrt(num) ).intValue();
    for(int i=3; i <= k; i+=2 ) {
      if ( num % i == 0 ) return false;
    }
    return true;
  }
}
