import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
		Scanner c = new Scanner(System.in);
		int N = c.nextInt();
		int[] arr = new int[N];
		String s1 = c.next(), s2 = c.next();
		for(int i=0; i<N; i++)
		{
			if(s1.charAt(i) == s2.charAt(i))
				arr[i] = 1;
			else arr[i] = 0;
		}
//		System.out.println(Arrays.toString(arr));
		long ans = 3; int prev = 1;
		for(int i=0; i<N; i++)
		{ 
//			System.out.println(ans);
			ans%=(1e9+7);
			if(arr[i] == 0) 
			{
				if(prev == 0)
				{
					ans *= 3L;
				}
				else ans *= 2L;
				if(i==0) ans = 6L;
				prev  = 0;
				i++;
			}
			else
			{
				if(prev == 0)
				{
					ans *= 1L;
				}
				else ans *= 2L;
				if(i==0) ans = 3L;
				prev = 1;
			}
		}
		
		System.out.println((ans%(long)(1e9+7)));
	}
}
