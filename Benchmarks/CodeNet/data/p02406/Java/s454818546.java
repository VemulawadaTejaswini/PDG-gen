import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i;
		System.out.printf(" ");
		for(i=3;i<=x;i++)
		{
			if(i%3==0)
			{
				System.out.printf("%d",i);
				if(i<x)System.out.printf(" ");
			}
			else if(i%10==3)
			{
				System.out.printf("%d",i);
				if(i<x)System.out.printf(" ");
			}
		}
		System.out.printf("\n");
	}
}