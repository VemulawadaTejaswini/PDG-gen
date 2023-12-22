import java.util.Scanner;
 
public class Main{
 
 public static void main(String[] args){
  
   Scanner sc = new Scanner(System.in);
   
   int n = sc.nextInt();
   
   int m = sc.nextInt();
   
   int count = 0;
   
   int all = 0;
   
   String yon = "";
   
   double d = 0.0;
   
   int[] array = new int[n];
   
   for (int i = 0; i<array.length; i++){
    
     array[i] = sc.nextInt();
     
     all += array[i];
     
   }
   
   d = all/(4.0*(double)m);
   
   for(int i:array){
    
    if((double)i >= d){
      
      count += 1;
  	
    }
     
   }
   
   if(count >= m){
     
     yon = "Yes";
   
   }else{
     
     yon = "No";
     
   }
   
   System.out.println(yon);
   
 }
  
  
  
  
}  