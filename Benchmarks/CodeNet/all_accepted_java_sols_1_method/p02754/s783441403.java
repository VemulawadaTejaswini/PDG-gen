

import java.util.*;
import java.io.*;


public class  Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long size=sc.nextLong();
		long blue=sc.nextLong();
		long red=sc.nextLong();
		long total=blue+red;
		long ans=0;
		long div=0;
		long mod=0;
		if(blue==0)
		{ans=0;}
		else if(size<total)
		{
			 if(size>=blue)
			{
				ans=blue;
			}
			else if(size<blue)
			{
				ans=size;
			}
		}
		else if(size>=total)
		{
			
			div=size/total;
			mod=size%total;
			if(mod>blue)
			{
				mod=blue;
			}
			ans=(div*blue)+mod;
		
		}
		System.out.println(ans);

		
	}



	}







