import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String line;
      String[] num;
      int a,b,t,gdc;
      long lcm;
      StringBuilder result = new StringBuilder();
      while(true) {

        if( ((line = br.readLine()) == null) || line.isEmpty() ) break;

        num = line.split(" ");
        a = Integer.parseInt(num[0]);
        b = Integer.parseInt(num[1]);
        if( a<b ) {
          t=a; a=b; b=t;
        }

        gdc = gdc(a, b);
        lcm = lcm(a, b, gdc);

        result.append(gdc).append(" ").append(lcm).append("\n");
      }

      System.out.print(result);
    }
    catch( IOException e) {
      System.out.println("IOException!");
    }
  }

  private int gdc(int x, int y) {
    int d = x%y;
    if( d == 0 ) return y;
    else return gdc(y, d);
  }

  private long lcm(long x, long y, int gdc) {
    return x * y / gdc;
  }
}
