import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		
		int[] a = new int[n];
		
		int[] rleft = new int[n];
		int[] gleft = new int[n];
		int[] bleft = new int[n];
		
		int sumr = 0;
		int sumg = 0;
		int sumb = 0;
		for(int i = 0; i < n; i++)
		{
			if(s.charAt(i) == 'R')
			{
				a[i] = 0; sumr++;
			}
			else if(s.charAt(i) == 'G')
			{
				a[i] = 1; sumg++;
			}
			else if(s.charAt(i) == 'B')
			{
				a[i] = 2; sumb++;
			}
			rleft[i] = sumr;
			gleft[i] = sumg;
			bleft[i] = sumb;
		}

		
//		System.out.println("Start");
		
		int[][] trans = new int[3][3];
		
		long gross = 0;
//		System.out.println(Arrays.toString(a));
		
		int[] sum = new int[3];
		for(int i = n-1; i >= 0; i--)
		{
			sum[a[i]]++;
			
			for(int j = 0; j < 3; j++)
			{
				if(j != a[i])
				{
					trans[a[i]][j] += sum[j];
				}
			}
			int other1 = (a[i]+1)%3; if(other1<0)other1+=3;
			int other2 = (a[i]+2)%3; if(other2<0)other2+=3;
			//n12
			int cur = trans[other1][other2] + trans[other2][other1];
			gross += cur;
			
//			System.out.println("i " + i + ": " + cur);
		}
		
		long an = gross;
		for(int i = 0; i < n; i++)
		{ //i: center
			for(int k = 1; i-k>=0 && i+k < n; k++)
			{ //k: offset
				if(a[i-k] != a[i+k] && a[i-k] != a[i] && a[i+k] != a[i])
					an--;
			}
			
		}
		
//		System.out.println("gross " + gross);
		System.out.println(an);
	}

}
