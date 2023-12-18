import java.io.*;

public class Main{
   public static void main(String[] args)throws IOException{
      BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));
     double pai = Math.PI;
   	 double r = Double.parseDouble(br.readLine());
   	
   	double menseki = r*r*pai;
   	double enshuu = 2*r*pai;
   	
   	String ans1 = String.format("%.6f", menseki);
   	String ans2 = String.format("%.6f", enshuu);
   	
   	System.out.println(ans1+" "+ans2);
   }
}