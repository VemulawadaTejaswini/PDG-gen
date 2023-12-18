import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int[] x=new int[n];
    	int t = 0;
    	for(int i=0;i<n;i++) {
    		x[i] = sc.nextInt();
    		t+=x[i];
    	}
    	t/=n;
    	long sum = 0;
    	long sum1= 0;
    	long sum2 = 0;
    	for(int i=0;i<n;i++) {
    		sum+=(int)Math.pow(x[i]-t, 2);
    	}
    	for(int i=0;i<n;i++) {
    		sum1+=(int)Math.pow(x[i]-t-1, 2);
    	}
    	for(int i=0;i<n;i++) {
    		sum2+=(int)Math.pow(x[i]-t+1, 2);
    	}
    	System.out.println(Math.min(Math.min(sum, sum1), sum2));
	}
}