import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		int[] num = new int[3];
		Scanner sc = new Scanner(System.in);
		int i,temp,sorted,count=0,minimum;
		for(i=0;i<3;i++)
		{
			num[i] = sc.nextInt();
			count++;
		}

		for(sorted=0;sorted<count;sorted++)
		{
			minimum = sorted;
			for(i=sorted+1;i<count;i++)
			{
				if(num[i]<num[minimum])
				{
					minimum = i;
				}
			}
			temp = num[minimum];
			num[minimum] = num[sorted];
			num[sorted] = temp;
		}

		for(i=0;i<count;i++)
		{
			System.out.printf("%d",num[i]);
			if(i<count-1)System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}