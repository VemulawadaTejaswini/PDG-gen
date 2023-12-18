import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
 int x,i,tmp;
 StringBuilder sb = new StringBuilder();
 
 x = Integer.parseInt(br.readLine());
  for(i=1;i<=x;i++){
   if(i%3==0){
    sb.append(" "+i);
   }else{
   tmp=i;
    while(tmp!=0){
      if(tmp%10==3){    
       sb.append(" "+i);  
       break;    
      }
     tmp =tmp/10; 
    }
   }
  }
  System.out.println(sb); 
  
 }
}