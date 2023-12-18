import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main{
  public static void main(String args[]) throws IOException{
   int m,f,r,sum;
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   while(true){
   String line = br.readLine(); 
   String[] token = line.split(" ");
    m = Integer.parseInt(token[0]);      
    f = Integer.parseInt(token[1]);
    r = Integer.parseInt(token[2]);
    if(m == -1 && f == -1 && r == -1) break;
    sum = m + f;     
    if(sum >= 80){  
     System.out.println("A");   
    }else if( 65 <= sum && sum< 80){ 
     System.out.println("B");   
     }else if( 50 <= sum && sum< 65){ 
       System.out.println("C");
     }else if( 30 <= sum&& sum < 50){
       if(r>=50){
        System.out.println("C");   
       }else{
         System.out.println("D");
       }
     }else if(m==-1||f == -1){
       System.out.println("F");
     }else{
       System.out.println("F");
     }
   }
 
  }
}