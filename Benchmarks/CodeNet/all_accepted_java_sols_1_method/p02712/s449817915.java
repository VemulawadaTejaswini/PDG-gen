import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    long sum = 0L;
    for (int i = 1; i <= n; i++) {
      if (i % 3 != 0 && i % 5 != 0) {
      	sum += i;
      }
    }
    
    System.out.print(sum);
  }
}