import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		long[] a = new long[n];
		
		int dirright = -1;
		int dirleft = -1;
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextLong();
			if(a[i] == 0)k--;
			
			if(a[i] > 0)
			{
				if(dirright == -1)dirright=i;
			}
			else if(a[i] < 0)
				dirleft = i;
		}
		if(k==0)
		{
			System.out.println(0);
			return;
		}
		
//		long[] costl = new long[k+1];
//		long[] costr = new long[k+1];
		long an = 99999999999999l;
		int curcan = 0;
		
		if(dirleft != -1)
		for(int i = dirleft; i >= 0 && curcan < k; i--)
		{ //assume we go here first... then go back
			curcan++;
			long curd = -a[i];
			if(curcan < k)
			{
				curd += -a[i];
				if(dirright != -1 && dirright + (k-curcan) - 1 < n)
				{
					curd += a[dirright + (k-curcan) - 1];
					an = Math.min(an, curd);
				}
			}
			else an = Math.min(an, curd);
		}
		curcan = 0;
		
		if(dirright != -1)
		for(int i = dirright; i < n && curcan < k; i++)
		{ //assume we go here first... then go back
			curcan++;
			long curd = a[i];
			if(curcan < k)
			{
				curd += a[i];
				if(dirleft != -1 && dirleft - (k-curcan) + 1 >= 0)
				{
					curd += -a[dirleft - (k-curcan) + 1];
					an = Math.min(an, curd);
				}
			}
			else an = Math.min(an, curd);
		}
		System.out.println(an);
	}

}
