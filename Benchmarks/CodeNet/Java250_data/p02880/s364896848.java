import java.util.Scanner;

public class Main{
   public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int num1 = scan.nextInt();
     int answer = 0;
     int i, j;
     
     for( i=1 ; i < 10 ; i++ ){
       for( j=1 ; j < 10 ; j++ ){
         if( i * j == num1 ){
           answer = 1;
           break;
         }
       }
     }
     if( answer == 1 )
       System.out.println("Yes");
     else
       System.out.println("No");
   }
}