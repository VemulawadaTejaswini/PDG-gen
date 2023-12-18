import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] Ai = new int[N];
   for(int i = 0;i<N;i++) Ai[i] = sc.nextInt(); 

   Arrays.sort(Ai);
   
   System.out.println(Ai[N-1]-Ai[0]);
 }
}