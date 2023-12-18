import java.io.*;
  
class main
{
   public static void main(String args[]) throws Exception{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int n = Integer.parseInt(br.readLine());
   int s = n%60;
   int h = (n-s)/3600;   
   int m = (n-s-h*3600)/60;

   System.out.println(h + ":" + m + ":" + s);
}
}