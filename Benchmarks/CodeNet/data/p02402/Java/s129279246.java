import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   price = Integer.parseInt(br.readLine());
   longint n,max,min,sum;
   int i;   
   String[] strAry = str.split(" ");
   min = Integer.parseInt(strAry[0]);  
   max = Integer.parseInt(strAry[0]);
   n = br.readLine(); 
     
   sum=0;
   for(i=0,;i<n;i++){
     sum=sum + strAry[i];
     if(min>strAry[i]){ 
       min=strAry[i];
     }
     if(max<strAry[i]){
       max=strAry[i];
      }
      
   }
       
      System.out.println(min+ " " + max +" "+sum);   

  }
}