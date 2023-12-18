import java.util.Scanner;

public class Main
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		int     N=sc.nextInt();
		int[][] dat =new int[N][3];
		int[] score =new int[N];
		
		for(int i=0; i<N; i++)
		for(int j=0; j<3; j++)
			dat[i][j]=sc.nextInt();
		
		for(int round=0; round<3; round++)
		{
			for(int no1=0; no1<N; no1++)
			{
				boolean isUnique=true;
				for(int no2=0; no2<N; no2++)
				{
					if(no1!=no2 && dat[no1][round]==dat[no2][round])
					{
						isUnique=false;
						break;
					}
				}
				if(isUnique)score[no1]+=dat[no1][round];
			}
		}
		for(int i=0; i<N; i++)
			System.out.println(score[i]);
	}
}