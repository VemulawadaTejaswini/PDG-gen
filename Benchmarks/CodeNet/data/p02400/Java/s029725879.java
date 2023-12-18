/* AIZU ITP1_4_A */
import java.io.*;

class Main
{
  public static void main(String[] args) throws IOException
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      double rad = Double.parseDouble(str); // input radius
      double space = rad * rad * Math.PI; // space
      double cirf = 2 * rad * Math.PI; //circumference

      System.out.printf("%.6f %.6f", space, cirf); //output
      System.out.println("");

    } catch (Exception e){ // error detection
      System.exit(-1);
    }
  }
}