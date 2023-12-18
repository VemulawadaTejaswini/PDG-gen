import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main{
  public static void main(String args[]) throws IOException{
   
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   while(true){
   String[] token = br.readLine().split(" ");
    int m = Integer.parseInt(token[0]);      
    int f = Integer.parseInt(token[1]);
    int r = Integer.parseInt(token[2]);
    if(m == -1 && f == -1 && r == -1) {break;}
       
    if(m+f >= 80){  
     System.out.println("A");   
    }else if( m + f >= 65){ 
     System.out.println("B");   
     }else if( m + f >= 50 ){ 
       System.out.println("C");
     }else if( 30 <= m+f){
       if(r>=50){
        System.out.println("C");   
       }else{
         System.out.println("D");
       }
     }else if(m==-1||f == -1){
       System.out.println("F");
     }else if(m+f<30){
       System.out.println("F");
     }else{
       System.out.println("F");
     }

   }
 
  }
}