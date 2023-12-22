import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   
   int sum = 0;
   if(A>B){
    sum += A;
    A = A-1;
   }
   else
   {
    sum += B;
    B = B-1; 
   }
   if(A>B){
    sum += A;
    A = A-1;
   }
   else
   {
    sum += B;
    B = B-1; 
   }
   System.out.println(sum);
 }
}