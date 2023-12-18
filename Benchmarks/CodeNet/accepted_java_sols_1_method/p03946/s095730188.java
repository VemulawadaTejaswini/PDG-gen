import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] maxr = new long[n];
		long[] minl = new long[n];
		
		long cap = sc.nextLong();
		
		long curma = 9999999999999l;
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextLong();
			curma = Math.min(curma, a[i]);
			minl[i] = curma;
		}
		curma = 0;
		for(int i = n-1; i >= 0; i--)
		{
			curma = Math.max(curma, a[i]);
			maxr[i] = curma;
		}
		
		
		long maxdif = 0;
		for(int i = 0; i < n-1; i++)
		{
			maxdif = Math.max(maxdif, maxr[i+1] - a[i]);
		}
		
//		System.out.println("Init maxdif; " + maxdif);
		int[] role = new int[n];
		
		int ls = 0;
		int rs = 0;
		for(int i = 0; i < n; i++)
		{
//			System.out.println("now " + a[i]);
			if(i<n-1)
			{
//				System.out.println("maxr " + maxr[i+1]);
			}
			if(i>0)
			{
//				System.out.println("minl " + minl[i-1]);
				
			}
			if(i < n-1 && maxr[i+1]-a[i] == maxdif)
			{
				role[i] = 1; //role L.
				ls++;
			}
			if(i > 0 && a[i] - minl[i-1] == maxdif)
			{
//				if(role[i] == 1)System.out.println("ERROR!");
				role[i] = 2;
				rs++;
			}
			
		}
//		System.out.println(ls + " " + rs);
		System.out.println(Math.min(ls, rs));
	}

}
