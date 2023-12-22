

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
		ar[i]=scan.nextInt();
		}
		int score[]=new int[n];
		score[n-1]=0;
		for(int i=n-2;i>=0;i--)
		{
			if(ar[i]>=ar[i+1])
			{
				score[i]+=score[i+1]+1;
			}
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			max=Math.max(max, score[i]);
		}
		System.out.println(max);
	}
}
