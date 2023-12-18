import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bits = 50;
		
		long[] mask = new long[bits];
		long curm = 1;
		for(int i = 0; i < bits; i++)
		{
			mask[i] = curm;
			curm *= 2;
		}
//		System.out.println(Long.toString(curm,2));
		
		long k = sc.nextLong();
		
		long[] bitocc = new long[bits];
		long[] kbit = new long[bits];
		
		for(int j = 0; j < bits; j++)
		{
			if((mask[j] & k) > 0)kbit[j]++;
		}
		
		long sum = 0;
		for(int i = 0; i < n; i++)
		{
			long cur = sc.nextLong();
			sum += cur;
			for(int j = 0; j < bits; j++)
			{
				if((mask[j] & cur) > 0)bitocc[j]++;
			}
		}
		
		if(k == 0)
		{
			System.out.println(sum);
			return;
		}		
		
		long idealnum = 0;
		boolean[] ideal = new boolean[bits];
		long[] idealr = new long[bits];
		for(int i = 0; i < bits; i++)
		{
			if(bitocc[i] < n/2 + n%2)
			{
				idealnum += mask[i];
				ideal[i] = true;
			}
			long mul = Math.max(bitocc[i], n-bitocc[i]);
			idealr[i] += mul * mask[i];
			if(i>0)idealr[i] += idealr[i-1];
		}
		
		boolean imp = true;
		
		int startbit = -1;
		long butimp = 0;
		long[] maxleft = new long[bits];
		for(int i = bits-1; i >= 0; i--)
		{
			long mul = 0;
			if(kbit[i] == 1)
				mul = n - bitocc[i];
			else mul = bitocc[i];
			maxleft[i] += mul * mask[i];
			if(i < bits-1)maxleft[i] += maxleft[i+1];
			
			if(startbit == -1 && kbit[i] == 1)
			{
				startbit = i;
			}
		}
		
//		System.out.println("Startbit " + startbit);
		long best = maxleft[0];
		for(int i = startbit; i >= 0; i--)
		{
			if(kbit[i] == 1)
			{
				long curb = 0;
				curb += bitocc[i] * mask[i];
				if(i>0)curb += idealr[i-1];
				if(i<bits-1)curb+=maxleft[i+1];
				best = Math.max(best, curb);
			}
		}
		
		System.out.println(best);
	}

}
