import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String[] strAry; 
   long n,max,min,sum;
    n = Integer.parseInt(br.readLine()); 
   int i;   
   strAry = br.readLine().split(" ");
   min = Integer.parseInt(strAry[0]);  
   max = Integer.parseInt(strAry[0]);
   
     
   
   for(i=0,sum=0;i<n;i++){
     sum=sum + Integer.parseInt(strAry[i]);  
    if(min>Integer.parseInt(strAry[i])){ 
       min=Integer.parseInt(strAry[i]);
     }
     if(max<Integer.parseInt(strAry[i])){
       max=Integer.parseInt(strAry[i]);
      }
      
   }
       
      System.out.println(min+ " " + max +" "+sum);   

  }
}