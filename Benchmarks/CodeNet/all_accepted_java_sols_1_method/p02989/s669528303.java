import java.util.Scanner;
import java.util.Arrays;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] p = new int[N];
   for(int i = 0; i<N ; i++){
   p[i] = sc.nextInt();
   }
   int K = 0;
   Arrays.sort(p);
   K = p[(N/2)] - p[(N/2)-1];
  System.out.println(K);   
 }
}