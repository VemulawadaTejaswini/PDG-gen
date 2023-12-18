import java.io.*;

public class Main{
   public static void main(String[] args)throws IOException{
      BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));
      double pi = Math.PI;
      double r = Double.parseDouble(br.readLine());
      
      System.out.println(r*r*pi+" "+2*r*pi);
   }
}