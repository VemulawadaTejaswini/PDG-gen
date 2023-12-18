import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i,three,th_h,th_t;
		for(i=3;i<=x;i++)
		{
			three=i/10;
			th_h=i/100;
			th_t=i/1000;
			if(i%3==0)
			{
				System.out.printf(" %d",i);
			}
			else if((three%10==3)||(th_h%10==3)||(th_t%10==3)||(i%10==3))
			{
				System.out.printf(" %d",i);
			}
		}
		System.out.printf("\n");
	}
}