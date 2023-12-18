import java.util.Scanner;
class A-Payment {
 public static void main (String args[]) {
   Scanner sc = new Scanner (System.in);
   System.out.println("いくら？:");
   int N = sc.nextInt();
   int k = 1;
   do {
     k += 1;
   }while (N-1000*k > 0);
   System.out.println("おつりは"+(1000*k-N)+"です");
 }
}