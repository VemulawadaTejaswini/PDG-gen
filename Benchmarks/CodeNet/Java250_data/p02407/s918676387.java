import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int length,date,i;
  length = Integer.parseInt(br.readLine());
  String[] strAry;
  strAry = br.readLine().split(" ");
  
  for(i=length-1;i>=0;i--){
   if(i<length-1){
    System.out.print(" "+ strAry[i]);
   }else{
    System.out.print(strAry[i]);
   }
  }
  System.out.println("");
    
 }
}