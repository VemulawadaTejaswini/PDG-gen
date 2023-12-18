import java.util.Scanner;
import java.util.Arrays;
public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n =kbd.nextInt();
   int k =kbd.nextInt();
   int[] A= new int[n];
   for(int i=0;i<n;i++){
     A[i]=kbd.nextInt();
   }

   Arrays.sort(A);
   int x=0;
   for(int i=0;i<k;i++){
     x=x+A[i];
   }
   System.out.println(x);
 }
}
