import java.io.*;
import java.util.*;
class Main{
 public static void main(String[] args) throws IOException {
        // TODO code application logic here
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       
              int n = Integer.parseInt(bf.readLine()); 
  
 if(n%1000==0){
   System.out.println(0);
   
 }
   else{
     System.out.println(1000-(n%1000));
   }
   
  
        
 }
  
  
  
}