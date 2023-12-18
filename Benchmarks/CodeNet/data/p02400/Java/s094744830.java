import java.io.*;
import java.lang.Math;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    double r=Double.parseDouble(br.readLine());

    double l=2*Math.PI*r;
    double s=Math.pow(r,2)*Math.PI;

    System.out.println(String.format("%.6f",l)+" "+String.format("%.6f",s));
  }
}
