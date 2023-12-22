import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] Li = new int[N];
   for(int i =0;i<N;i++) Li[i] = sc.nextInt();
   
   Arrays.sort(Li);
   int sum =0;
   for(int i =0;i<N-1;i++) sum += Li[i]; 
   
   if(Li[N-1] < sum) System.out.println("Yes");
   else System.out.println("No");
 }
}