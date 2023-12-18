
import java.util.Scanner;

public class Main {

 public static void main (String[] args){

   Scanner sc = new Scanner(System.in);

   int N = sc.nextInt();
   int K = sc.nextInt();
   int X = sc.nextInt();
   int Y = sc.nextInt();
   int sum1 = 0;
   int sum2 = 0;


   if (N >= K){
   sum1 =  X * K;
   sum2 =  Y * (N-K);
   System.out.println(sum1 + sum2);
    }

    else {
    sum1 =  X * N;
   System.out.println(sum1);
    }
 }
}
