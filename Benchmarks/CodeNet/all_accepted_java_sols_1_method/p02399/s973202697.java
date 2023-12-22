import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
  int a,b,d,r;
  String f;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  
   String str = br.readLine(); 
   String[] strAry = str.split(" ");
   a = Integer.parseInt(strAry[0]);  
   b = Integer.parseInt(strAry[1]);   
   d = a/b;
   r = a%b;
   f=String.format("%.5f", ((double)a / (double)b));    
   
   f = String.format("%.5f", ((double)a / (double)b));
   System.out.println(d + " "+ r +" "+ f); 
 }
}