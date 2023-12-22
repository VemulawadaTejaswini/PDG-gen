import java.util.Scanner;
 public class Main{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int X=sc.nextInt();
   int A=sc.nextInt();
   int B=sc.nextInt();
           int left= X-A;
     while(left>=B)
   {
left-=B;

   }

           System.out.println(left);


   sc.close();
 }
}
