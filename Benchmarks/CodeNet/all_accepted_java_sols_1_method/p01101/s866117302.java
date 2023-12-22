import java.util.Scanner;
import java.util.Arrays;

public class Main {
	static int a,b;
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while(true) {
    	   int n = sc.nextInt();
    	   int m = sc.nextInt();
    	   if(n+m==0)break;
    	   int[] a = new int[n];
    	   for(int i=0;i<n;i++) {
    		   a[i] = sc.nextInt();
    	   }
    	   int ans = 0;
    	   for(int i=0;i<n;i++) {
    		   for(int j=0;j<n;j++) {
    			   if(i==j)continue;
    			   if(ans < a[i]+a[j] && a[i]+a[j] <= m) ans = a[i]+a[j];
    		   }
    	   }
    	   if(ans == 0) System.out.println("NONE");
    	   else  System.out.println(ans);
       }
    }
}
