import java.util.*;

class Main{           
  
   public static void main(String[] args){
         Scanner sc = new Scanner(System.in);  
         
         while(true){
             int n = sc.nextInt();
             if(n == 0){
                 break;
             }
             
             int min = Integer.MAX_VALUE;
             
             int a[] = new int[n];
             for(int i = 0;i < n;i++){
                 a[i] = sc.nextInt();
             }
             
             Arrays.sort(a);
             
             int before = a[0];
             for(int i = 1;i < n;i++){
                 int target = a[i];
                 min = Math.min(min,Math.abs(target-before));
                 before = target;
             }
             
             System.out.println(min);             
             
         }
         
         
   }         
         
 }
  

        
        