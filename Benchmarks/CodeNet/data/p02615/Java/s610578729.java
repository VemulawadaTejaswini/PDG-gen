import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		long[] arr=new long[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextLong();
		}
		
		Arrays.sort(arr);
		
		int[] count=new int[n];
		count[n-1]=1;
		
		int ptr=n-1;
		
		long ans=0;
		
		for(int i=n-2;i>=0;i--)
		{
			if(count[ptr]==2)
			{
				ans=ans+arr[ptr];
				count[ptr]--;
			}
			else
			{
				ans=ans+arr[ptr];
				count[ptr]=0;
				ptr--;
				count[ptr]=2;
			}
		}
		
		System.out.println(ans);
		
	}
	
}