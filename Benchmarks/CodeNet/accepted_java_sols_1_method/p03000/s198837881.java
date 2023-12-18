import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int X = sc.nextInt();
   int[] Larr = new int[N];
   for(int i =1;i<=N;i++){
    Larr[i-1] = sc.nextInt(); 
   }
int sum = 0;
int count = 0;
   while(count < N && sum <= X)
   {
   sum = sum + Larr[count];
   count++;
   }
   if(sum <=X && count ==N) count++;
   System.out.println(count);
 }
}