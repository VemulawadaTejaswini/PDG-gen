import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int minv = Integer.parseInt(br.readLine());
      int n1   = Integer.parseInt(br.readLine());
      int maxv = n1- minv;
      if ( n1 < minv ) minv = n1;

      for( int i=2,r,mv; i<n; i++) {
        r = Integer.parseInt(br.readLine());
        if ( (mv = r-minv) > maxv ) maxv = mv;
        if ( r < minv ) minv = r; 
      }

      System.out.println(maxv);
    }
  }
}
