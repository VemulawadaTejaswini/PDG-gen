import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] xi = new int[N];
      int[] yi = new int[N];
   for(int i=0;i<N;i++ )
   {
     xi[i] = sc.nextInt(); 
     yi[i] = sc.nextInt(); 
   }
   int[] Ni = new int[N];
   for(int i=0;i<N;i++ )
   {
     Ni[i] = i+1;
   }
   double sum = 0;
   for(int i = 0 ; i < N ;i++)
   {
     for(int k = i+1;k < N ;k++)
     {
       sum += Math.sqrt((xi[i] - xi[k]) * (xi[i] - xi[k]) + (yi[i] - yi[k]) * (yi[i] - yi[k])); 
     }
   }
   System.out.println(2*sum/N);
 }
}