 
import java.util.ArrayList;
import java.util.Scanner;

 class Main  {
     public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int max = 0 ;
         if(n==1){
             max = 1;
         }
         for(int i = 2 ; i<= n ; i++ ){
             for(int j  = 1 ; j<=n ; j++){
                
                 if(Math.pow(j, i) - (int)Math.pow(j,i) == 0){
                     
                     if( (int)Math.pow(j,i) > max && (int)Math.pow(j,i)<=n){
                         max =  (int)Math.pow(j,i) ;
                     }
                 }
                  //System.out.print((int)Math.pow(j,i)+" ");
                 if( (int)Math.pow(j+1,i ) > n){
                     break;
                 }
                 
             }
             //System.out.println();
         }
         System.out.println(max);
         
     }
}
