import java.util.*;
public class Main {

	public static void main(String[] args) {		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		long sum[] = new long[n];
		int mod = (int)Math.pow(10, 9)+7;
		for(int i=0;i<n;i++)
		{
			arr[i] = scn.nextInt();
		}
		for(int j=n-1;j>0;j--) {
			if(j<n-1)
				sum[j] = (sum[j+1]+arr[j])%mod;
			else
				sum[j] = arr[j];
		}
		long result = 0;
		for(int i=0;i<n-1;i++)
		{
			long temp = (sum[i+1]*arr[i])%mod;
			result = (result+temp)%mod;
		}
		//result = (result+arr[n-1])%mod;
		System.out.println(result);
		
		/*String s = scn.next();
		String t = scn.next();
		int min = t.length();
		for(int i=t.length()-1;i>=0;i--)
		{
			if(s.contains(t.substring(0,i))) {
				int val = t.length()-i;
				System.out.println(t.substring(0,i)+" "+val);
				if(min>val)
					min= val;
			}
		}
		for(int i=0;i<t.length();i++)
		{
			if(s.contains(t.substring(i))) {
				int val = i;
				System.out.println(t.substring(i)+" "+val);
				if(min>val)
					min= val;
			}
		}
		System.out.println(min);*/
	}

}
