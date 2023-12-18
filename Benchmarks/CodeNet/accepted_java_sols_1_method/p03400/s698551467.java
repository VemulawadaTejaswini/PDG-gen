import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int D = sc.nextInt();
   int X = sc.nextInt();
   int[] l = new int[N];
   
   for(int i=0;i<N;i++) l[i] = sc.nextInt();
   int sum =N;
   for(int i=0;i<N;i++) sum +=(D-1)/l[i];
   System.out.println(sum+X);
 }
}