import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
  int a,b;
  double f;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  
   String str = br.readLine(); 
   String[] strAry = str.split(" ");
   a = Integer.parseInt(strAry[0]);  
   b = Integer.parseInt(strAry[1]);   
   f=(double)a/(double)b;    
  
   System.out.println(a/b + a%b + f); 
 }
}