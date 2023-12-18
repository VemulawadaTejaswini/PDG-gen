import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
  int a,b,c,i,ans;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  
   String str = br.readLine(); 
   String[] strAry = str.split(" ");
   a = Integer.parseInt(strAry[0]);  
   b = Integer.parseInt(strAry[1]);   
   c = Integer.parseInt(strAry[2]); 
   
   i=0;
   for(ans=a;ans<=b;ans++){
     if(c%ans==0){i++;} 

   }
  System.out.println(i); 
 }
}