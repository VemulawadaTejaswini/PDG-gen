import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    
    
    
     public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         int A = sc.nextInt();
         int L = sc.nextInt();
          int b[ ] = new int[A];
         int a[ ] = new int[A];
         for(int i = 0 ; i<A ; i++){
                   a[i]  =  i+1;
             
         }
         
       for(int i = 0 ; i<A ; i++){
               b[i]=  L+a[i]-1;
           
       }  
         Arrays.sort(b);
         int sum = 0 ;
         int min=Integer.MAX_VALUE;
         int index=-1;
         for(int i=0;i<A;i++)
         {
             sum+=b[i];
             if(min>Math.abs(b[i])){
                 min=Math.abs(b[i]);
                 index=i;
             }
         }
         
         
      //   System.out.println(b[1]+b[2]+b[3]+b[4]+b[5]);
         System.out.println(sum-b[index]);
         
    }
}
