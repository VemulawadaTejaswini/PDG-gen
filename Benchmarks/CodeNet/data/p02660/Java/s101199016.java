import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(in.readLine());
    long count = 0;
    for(long i=2; i<=Math.sqrt(Math.pow((long)10,(long)12)); i++){
      if(n%i==0){
        count += 1;
        n = n/i;
      }
    }
    if(count == 0 && n>1)
      count += 1;
    System.out.println(count);
  }
}