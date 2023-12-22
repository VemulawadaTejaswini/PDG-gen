import java.util.Scanner;

public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   int C = sc.nextInt();

   int tenp = 0;
   int tenp2 = 0;

   tenp = A;
   tenp2 = B;
   A = C;
   B = tenp;
   C = tenp2;

   System.out.print(A + " ");
   System.out.print(B+ " ");
   System.out.print(C+ " ");
   }
}


