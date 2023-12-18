import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        int tests;
       
     tests = sc.nextInt();
        int[][] A = new int[tests][2];
      int x=0;
      int y=0;
      int count=0;
      while(count<tests){
        if(sc.hasNextInt()){
         x = sc.nextInt();
        }
         if(sc.hasNextInt()){
      y = sc.nextInt();
         }
        A[count][0] =x;
          A[count][1] =y;
        
        count++;
      }
      

      
      for(int i=0;i<tests;i++){
       int c=1;
        for(int j=0;j<tests;j++){
          if( ((A[i][0] > A[j][0] && A[i][1] > A[j][1] ) ||
              (A[i][0] < A[j][0] && A[i][1] < A[j][1] )){
             c++;
          }
        
        }
         System.out.println(c);
      }
      
       
    
     
         
       
       
        
  }
}
        
