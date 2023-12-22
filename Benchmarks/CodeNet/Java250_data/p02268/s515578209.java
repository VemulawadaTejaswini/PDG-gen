import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n, q, A[] = new int[100000], m[] = new int[50000];
		n = sc.nextInt();
		for(int i = 0; i < n; i++)
		{
			A[i] = sc.nextInt();
		}
		q = sc.nextInt();
		for(int i = 0; i < q; i++)
		{
			m[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0; i < q; i++)
		{
			int ok = -1;
			int ng = n;
			boolean aru = false;
			while(Math.abs(ok - ng) > 1)
			{
				int mid = (ok + ng) / 2;
				if(A[mid] == m[i])
				{
					aru = true;
					break;
				}
				if(A[mid] > m[i])
				{
					ng = mid;
				}
				else
				{
					ok = mid;
				}
			}
			if(aru)
			{
				++ans;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
