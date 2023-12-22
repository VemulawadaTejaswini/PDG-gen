import java.util.Scanner;


class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   long A = sc.nextLong();
   double B = sc.nextDouble();
   long b = (long) (B*(double)100+0.5);

   System.out.println(A*b/(long)100);
 
 }
}

