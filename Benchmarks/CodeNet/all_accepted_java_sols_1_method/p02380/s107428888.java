/* ITP1_10_B */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] str = br.readLine().split(" ");
      double a = Double.parseDouble(str[0]);
      double b = Double.parseDouble(str[1]);
      double c_angle = (2 * Math.PI) * (Double.parseDouble(str[2]) / 360);

      double space, length, height;
      height = b * Math.sin(c_angle);
      space = height * a / 2;
      length = a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(c_angle));

      System.out.println(space + "\n" + length + "\n" + height);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}