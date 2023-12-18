import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	static int a,b;
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while(true) {
    	   int n = sc.nextInt();
    	   if(n==0)break;
    	   int sum = 0;
    	   Integer[] a = new Integer[n];
    	   for(int i=0;i<n;i++) {
    		   a[i] = sc.nextInt();
    		   sum += a[i];
    	   }
    	   double ave = sum/n;
    	   Arrays.sort(a);
    	   int ans = 0;
    	   for(int i= 0;i<n;i++) {
    		   if(a[i] <= ave) {
    			   ans += 1;
    		   }
    		   else {
    			  break;
    		   }
    	   }
    	   System.out.println(ans);
      }
    }
}
