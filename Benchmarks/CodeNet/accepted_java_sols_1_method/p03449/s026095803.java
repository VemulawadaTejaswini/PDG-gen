import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] arr = new int[2][n];

		for(int i =0;i<2;i++)
		{
			for(int j =0;j<n;j++)
			{
				arr[i][j] = s.nextInt();
			}
		}

		int[] sumarr = new int[n];
		int row =0 ;
		for(int i =0;i<n;i++)
		{
			int sum =0 ;
			row =0 ;
			for(int j = 0;j<n;j++)//1)start from 0 index of first row
			{
				if(j == i)//3)then horizontal  sum for row = 1;
				{
					sum+=arr[row][j];
					row++;
					sum+=arr[row][j];
					
				}
				else//2) sum until j != i i.e horizontal sum  for row =0 ;
				{
					sum+=arr[row][j];
				}
			}
			// System.out.println(sum);
			sumarr[i] = sum;
		}

		Arrays.sort(sumarr);
		System.out.println(sumarr[n-1]);

	}
}