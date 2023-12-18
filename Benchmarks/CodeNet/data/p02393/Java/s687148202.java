import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] num;
		num = new int[3];
		int i,temp,unsorted,count=0;
		for(i=0;i<3;i++)
		{
			num[i] = sc.nextInt();
			count++;
		}

		unsorted  = count;
		while(unsorted != 0)
		{
			for(i=0;i<count-1;i++)
			{
				if(num[i]<num[i+1])
				{
					if((i+1) >= unsorted)
					{
						unsorted--;
						break;
					}
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
				}
			}
		}
		for(i=0;i<count;i++)
		{
			System.out.printf("%d ",num[i]);
		}
	}
}