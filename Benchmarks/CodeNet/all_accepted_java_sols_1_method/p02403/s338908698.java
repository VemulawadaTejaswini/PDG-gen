import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String[] strAry; 
   int H,W,i,j;
      
   while(true){
     strAry = br.readLine().split(" ");
     H = Integer.parseInt(strAry[0]);  
     W = Integer.parseInt(strAry[1]);
     if(H==0&&W==0) break;
     for(j=0;j<H;j++){
       for(i=0;i<W;i++){
         System.out.print("#");
       }
       System.out.print("\n");  
     }     
     System.out.print("\n");  
     
    }  
      


  }
}