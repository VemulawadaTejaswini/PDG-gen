 
import java.util.Scanner;

 class Main  {
     public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
         int a = scan.nextInt();
         int b = scan.nextInt();
         int  x  =  999;
         int height[] =new int[1000];
         
         for(int i = 1 ; i <=999; i++){
             height[i] = (i*(i+1))/ 2 ;
         }
         for(int i = 1;i<=998 ; i++){
             if(height[i]>=a && height[i+1]>=b ){
                 if(height[i]-a == height[i+1]-b){
                     
                    System.out.println(height[i]-a);
                    break;
                 }  
            }
         }
           
     }
}
