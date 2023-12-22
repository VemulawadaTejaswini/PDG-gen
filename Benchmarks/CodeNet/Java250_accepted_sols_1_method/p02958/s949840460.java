import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] Ni = new int[N];
   for(int i = 0; i<N;i++)
   {
		Ni[i] = sc.nextInt();       
   }
   int count =0;
   for(int i = 0; i<N;i++)
   {
		if(Ni[i]-1 != i) count++;
   }
   if(count <=2)System.out.println("YES");
   else System.out.println("NO");
 }
}