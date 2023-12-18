import java.util.*;
import java.math.*;

class Main{       
   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);  
      
     int chair[] = new int[100002];
     
     int N = sc.nextInt();
     
     for(int i = 0; i < N;i++){
         int l = sc.nextInt();
         int r = sc.nextInt();         
         chair[l]++;
         chair[r+1]--;         
     }
      
     for(int i = 1;i <= 100000;i++){
         chair[i+1] += chair[i]; 
     }
     
     int count = 0;
     for(int i = 1;i<= 100000;i++){
         if(chair[i] > 0){
             count++;
         }
     }
     
     System.out.println(count);
      
   }
}