import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
		int n=s.length();
		
		//int[] a=new int[n];
		
		int[] count=new int[2019];count[0]=1;
		int x=1;
		int ans=0;
		int sum=0;
		for(int i=n-1;i>=0;i--) {
			char c=s.charAt(i);
			sum=(sum+Character.getNumericValue(c)*x);
			//System.out.println(sum);
			sum%=2019;
			if(sum<0)sum+=2019;
			//System.out.println((i+1)+" "+sum);
			count[sum]++;
			ans+=count[sum]-1;
			x=(x*10)%2019;
		}
		
		System.out.println(ans);
	}

}
