import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		boolean allneg = true;
		int mod=(int) (1e9+7);
		for(int i = 0; i < n; i++)
		{
			int x = in.nextInt();
			arr.add(x % mod);
			if(x > 0) allneg = false;
		}
		Collections.sort(arr, (a, b) -> compare(a, b));
		
		long sum = 1;
		if(allneg)
		{
			if(k % 2 == 1)
			{
				for(int i = n - 1; i >= n - k; i--)
				{
					sum *= arr.get(i);
					sum %= mod;
				}
			}
			else
			{
				for(int i = 0; i < k; i++)
				{
					sum *= arr.get(i);
					sum %= mod;
				}
			}
		}
		else
		{
			boolean pos = true;
			for(int i = 0; i < k - 1; i++)
			{
				sum *= arr.get(i);
				sum %= mod;
				if(arr.get(i) < 1) 
				{
					if(!pos) pos = true;
					else pos = false;
				}
			}
			if((pos && arr.get(k - 1) > 0) || (!pos && arr.get(k - 1) < 0)) sum *= arr.get(k - 1);
			else if(pos && arr.get(k - 1) < 0) 
			{
				for(int i = k - 1; i < arr.size(); i++)
				{
					if(arr.get(i) < 0) 
					{
						sum *= i;
						sum %= mod;
						break;
					}
				}
			}
			else if(!pos && arr.get(k - 1) > 0)
			{
				for(int i = k - 1; i < arr.size(); i++)
				{
					if(arr.get(i) > 0) 
					{
						sum *= i;
						sum %= mod;
						break;
					}
				}
			}
		}
		if(sum < 0) 
		{
			sum += mod;
			sum %= mod;
		}
		
		System.out.println(sum);
	}

	static int compare(int a, int b)
	{
		if(a < 0) a *= -1;
		if(b < 0) b *= -1;
		return b - a;
	}
}
