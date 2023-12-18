//package ABC171;
import java.util.*;
import java.io.*;
class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();
			
		}
		
		long xor=0;
		for(int i=0;i<n;i++)
		{
			xor=xor^a[i];
		}
		
		for(int i=0;i<n;i++)
		{
			if(i<n-1)
			{
				System.out.print((a[i]^xor)+" ");
			}
			else
			{
				System.out.print(a[i]^xor);
			}
		}
		System.out.println();
	}

}
