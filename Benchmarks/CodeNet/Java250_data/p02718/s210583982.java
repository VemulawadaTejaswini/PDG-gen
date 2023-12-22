import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] a = new int[n];
      float sum = 0;
      int count = 0;
      for(int i = 0;i<n;i++){
         a[i] = sc.nextInt();
         sum += a[i];
      }
      for(int i = 0;i<n;i++){
         if(a[i]>=sum/(4*m)){
            count++;
            if(count>=m){
               System.out.println("Yes");
               return;
               }
            
         }
      }
     
       System.out.println("No");
   }
}
