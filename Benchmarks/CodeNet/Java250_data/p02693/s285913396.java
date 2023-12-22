import java.util.*;
public class Main{
  
 public static void main(String[] args){
  
   Scanner sc = new Scanner(System.in);
   
     /*K倍*/
     int k = sc.nextInt();
     int a = sc.nextInt();
     int b= sc.nextInt();
   
   int seisu;
   int count = 0;
   for(int i=a;i<=b;i++){
     
     if(i%k == 0){ 
       seisu = i/k;
      
         count++;    
         break;
       
     }
   }
     
   if(count>0){
     System.out.println("OK");
   }else{
      System.out.println("NG");     
    }
 }
 }
   