import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int minv = Integer.parseInt(br.readLine());
      int maxv = Integer.parseInt(br.readLine()) - minv;

      for( int i=2,r,mv; i<n; i++) {
        r = Integer.parseInt(br.readLine());
        if ( (mv = r-minv) > maxv ) maxv = mv;
        if ( r < minv ) minv = r; 
      }

      System.out.println(maxv);
    }
  }
}
