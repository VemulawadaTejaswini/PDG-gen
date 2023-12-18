import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int z = 0; z < t; z++)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int house[] = new int[n];
			int length[] = new int[n-1];
			int ret;
			for(int i = 0; i < n; i++)
			{
				house[i] = sc.nextInt();
			}
			for(int i = 0;i < n-1; i++)
			{
				length[i] = house[i+1] - house[i];
			}
			ret = house[n-1] - house[0];
			Arrays.sort(length);
			for(int i = 0; i < k -1 ; i++)
			{
				if(n - 2 - i < 0) 
				{
					ret = 0;
					break;
				}
				ret -= length[n - 2 - i];
			}
			System.out.println(ret);
		}
	}
}