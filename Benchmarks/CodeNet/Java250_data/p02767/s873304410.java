    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int n=Integer.parseInt(scan.next());
    		int max=0;
    		int min=999;
    		int x_i;
    		int x[]=new int[n];
    		for (int i=0;i<n;++i) {
    			x_i=Integer.parseInt(scan.next());
    			max=Math.max(max, x_i);
    			min=Math.min(min, x_i);
    			x[i]=x_i;
    		}
    		int ans=Integer.MAX_VALUE;
    		int sum;
    		for (int p=min;p<=max;++p) {
    			sum=0;
    			for (int i:x) {
    				sum+=Math.pow(i-p,2);
    			}
    			ans=Math.min(ans, sum);
    			
    		}
    		System.out.print(ans);
    		
    }	
    }
// end 