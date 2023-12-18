import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 
   String[] xy = br.readLine().split(" ");

   double distance = Integer.parseInt(xy[0])*Integer.parseInt(xy[2])+Integer.parseInt(xy[1])*Integer.parseInt(xy[3]);

   System.out.println(distance);


  }
}