
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int m;
		int nmin;
		int nmax;
		
		while(true)
		{
			m = scan.nextInt();
			nmin = scan.nextInt();
			nmax = scan.nextInt();
			
			if(m == 0 && nmin == 0 && nmax == 0)
			{
				return;
			}
			else
			{
				new DataSet(m, nmin, nmax);
			}
		}

	}
	
	static class DataSet
	{
		int jukensha;
		int nmin;
		int nmax;
		List<Integer> score = new ArrayList<Integer>();
		
		public DataSet(int jukensha, int nmin, int nmax)
		{
			this.jukensha = jukensha;
			this.nmin = nmin;
			this.nmax = nmax;
			
			int largestGap = -1;
			int ans = -1;
			
			for(int i = 0; i < jukensha; i++)
			{
				score.add(scan.nextInt());
				//find biggest gap.
				
				if(i <= nmax && i > 0 && i >= nmin)
				{
					int gapWithPrev = score.get(i-1) - score.get(i);
//					System.out.println("hey " + i + " gap " + gapWithPrev);
					if(gapWithPrev >= largestGap)
					{
						largestGap = gapWithPrev;
						ans = i;
					}
				}
			}
			
			System.out.println(ans);
		}
	}

}

