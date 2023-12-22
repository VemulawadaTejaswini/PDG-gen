import java.util.Scanner;

public class Main{
   public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int num1 = scan.nextInt();
     int num2 = scan.nextInt();
     int answer;
     
     if( num1 >= 10 || num2 >= 10 )
       answer = -1;
     else 
       answer = num1 * num2;
     
     System.out.println(answer);
   }
}