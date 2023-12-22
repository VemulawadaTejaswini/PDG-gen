import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    long n = Long.parseLong(br.readLine());
    long temp = Long.MAX_VALUE;
    for (int i=1; i<Math.sqrt(n)+10; i++){
      if (n%i == 0 && i+n/i-2 < temp) temp = i+n/i-2;
    }
    
    System.out.println(temp);
  }
}
