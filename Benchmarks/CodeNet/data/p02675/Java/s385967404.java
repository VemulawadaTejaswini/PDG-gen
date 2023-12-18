import java.util.Scanner;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int s = sc.nextInt();

   if(s%10=2||s%10=4||s%10=5||s%10=7||s%10=9){
     System.out.println("hon");
   }
   else if(s%10=0||s%10=1||s%10=6||s%10=8){
     System.out.println("pon");
   }
   else if(s%10=3){
     System.out.println("bon");
   }
 
 }
}