import java.util.*;

class Main{           
  
   public static void main(String[] args){
         Scanner sc = new Scanner(System.in);  
         
         while(true){
             
             int n = sc.nextInt();
             
             if(n==0){
                 break;
             }
             
             int array[] = new int[n];
             
             for(int i = 0;i < n;i++){
                 array[i] = sc.nextInt();
             }
             
             Arrays.sort(array);
             
             int sum  =0;
             
             for(int i = 1;i < array.length-1;i++){
                 sum += array[i];
             }
                                       
             System.out.println(sum/(n-2));                          
             
         }
        

   }         
         
 }
  