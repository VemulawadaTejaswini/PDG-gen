import java.util.Scanner;

   class Main{
     public static void main(String[] args){
       Scanner stdIn = new Scanner(System.in);
       int a = stdIn.nextInt();
       int b = stdIn.nextInt();
       int c = stdIn.nextInt();
       if(b+c >= a){
         System.out.println(c-(a-b));
       }else{
         System.out.println(0);
       }
     }
   }