import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        boolean[] a = new boolean[n];
      
        for(int i = 0; i < n; i++){
          h[i] = sc.nextInt();
          a[i] = true;
        }
      
        int ans = 0;
        for(int i = 0; i < m; i++){
          int road1 = sc.nextInt()-1;
          int road2 = sc.nextInt()-1;
          if(h[road1] >= h[road2]){
            a[road2] = false;
          }
          if(h[road1] <= h[road2]){
            a[road1] = false;
          }
        }
      
       for(int i = 0; i < n; i++){
         if(a[i] == true){
           ans++;
         }
       }
        
       System.out.println(ans);
	}
}