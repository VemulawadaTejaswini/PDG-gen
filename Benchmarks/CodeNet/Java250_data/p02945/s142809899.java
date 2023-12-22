import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   int w = A+B;
   int s = A-B;
   int seki = A*B;
   
   int M1 = Math.max(w,s);
   int M = Math.max(M1,seki);

   System.out.println(M);
 }
}