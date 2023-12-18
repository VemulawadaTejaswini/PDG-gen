import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long A = sc.nextLong();
   long B = sc.nextLong();
   long K = sc.nextLong();
   long st = 0;
   
   if(A>K)
   {
     A-=K;
   }
   else
   {
     K-=A;
     A=0;
     if(K<B)
     {
       B-=K;
     }
     else
     {
       B=0;
     }
   }
   System.out.println(A+" "+B);
 }
}