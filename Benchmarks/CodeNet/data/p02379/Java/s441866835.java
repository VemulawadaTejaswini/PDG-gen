
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


   String[] xy = br.readLine().split(" ");
   double x1 = Double.parseDouble(xy[0]);
   double x2 = Double.parseDouble(xy[2]) ;

   double y1 = Double.parseDouble(xy[1]);
   double y2 = Double.parseDouble(xy[3]);
   double distance = Math.pow( x2-x1, 2 ) +Math.pow(y2 - y1 , 2);


   distance = Math.sqrt(distance);
   System.out.println(distance);


  }
}