
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


   String[] xy = br.readLine().split(" ");
   double a = Double.parseDouble(xy[0]);
   double b = Double.parseDouble(xy[1]) ;
   double c = Double.parseDouble(xy[2]) ;

   double S = 0.5 * a * b * Math.sin( Math.toRadians(c) );
   double L = a + b + Math.sqrt( Math.pow( a , 2 )  + Math.pow( b , 2 ) - 2* a * b * Math.cos( Math.toRadians(c) ) );
   double h = b * Math.sin( Math.toRadians(c) );

   System.out.println(S);
   System.out.println(L);
   System.out.println(h);

  }
}