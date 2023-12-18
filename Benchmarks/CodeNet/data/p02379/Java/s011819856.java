



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


   String[] xy = br.readLine().split(" ");
   double x1 = (double)Integer.parseInt(xy[0]);
   double x2 = (double)Integer.parseInt(xy[2]) ;

   double y1 = (double)Integer.parseInt(xy[1]);
   double y2 = (double)Integer.parseInt(xy[3]);
  // System.out.println(x1+"" +x2 +""+y1+""+y2);
   double distance = Math.pow( x2-x1, 2 ) +Math.pow(y2 - y1 , 2);


   distance = Math.sqrt(distance);
   System.out.println(distance);


  }
}