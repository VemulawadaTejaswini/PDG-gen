import java.io.*;
  public class Main{
    public static void main(String[] args)throws IOException{
      BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
      String str=mBufferedReader.readLine();
      double r=Double.parseDouble(str);
      double pi=3.141592653589;
      double l=2*r*pi;
      double s=r*r*pi;
      System.out.printf("%.8f %.8f%n",s ,l);
   }
}
