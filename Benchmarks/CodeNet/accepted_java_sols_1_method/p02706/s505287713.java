import java.util.*;
 public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] a = new int[M];
      

      for(int i = 0;i < M;i++){
        a[i] = sc.nextInt();
      }

      for(int i = 0;i < a.length;i++){
         N -= a[i];
      }
         if(N >= 0){
            System.out.println(N);
         }else{
            System.out.println(-1);
         }
      
         
   }
 }
