import java.util.Scanner;
import java.util.Arrays;

public class Main{
	static int a,b;
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while(true) {
    	   int n = sc.nextInt();
    	   if(n==0)break;
    	   int[] a = new int[n];
    	   for(int i=0;i<n;i++) {
    		   a[i] = sc.nextInt();
    	   }
    	   int min = 1000001;
    	   for(int i=0;i<n;i++) {
    		   for(int j=0;j<n;j++) {
    			   if(i==j)continue;
    			   int s = Math.abs(a[i]-a[j]);
    			   if(s < min) min = s;
    		   }
    	   }
    	   System.out.println(min);
       }
    }
}
