import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int M = sc.nextInt();
   int C = sc.nextInt();
   int[] Bi = new int[M];
   for(int i = 0; i<M;i++)
   {
		Bi[i] = sc.nextInt();       
   }
   int count =0;
   int sum = 0;
   for(int i = 0;i <N;i++)
   {
     sum = 0;
    for(int k = 0;k <M;k++)
    {
      sum += Bi[k]*sc.nextInt();      
    }
     sum += C;
     if(sum >0) count++;
   }
   System.out.println(count);
 }
}