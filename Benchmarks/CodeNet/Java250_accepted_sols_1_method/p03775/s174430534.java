import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(in.readLine());
    long a = 1;
    
    for(int i=1; i<=Math.sqrt(n); i++){
      if(n%i==0)
        a = n/i;
    }
    
    System.out.println((int)Math.log10(a)+1);
  }
}