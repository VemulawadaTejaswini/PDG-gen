import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String args[] ) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String line = br.readLine();
      int n = Integer.parseInt(line);
      int v = n;
      
      for(int i = 0; i < 2; i++){
        n *= v;
      }

      System.out.println(n);
    }
}