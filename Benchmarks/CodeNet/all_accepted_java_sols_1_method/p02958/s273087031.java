import java.util.*;
import java.io.*;
class Main
{

	public static void main(String args[])throws IOException
	{
		int n,count=0 ;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int p[]=new int[n];
		int p1[]=new int[n];
      	for(int i=0;i<n;i++)
      	{
      		p[i]=sc.nextInt();
      		p1[i]=p[i];
      	}
      	for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (p1[j] > p1[j+1]) 
                { 
                    int temp = p1[j]; 
                    p1[j] = p1[j+1]; 
                    p1[j+1] = temp; 
                } 
		for(int i=0;i<n;i++)
		{
			if(p1[i]!=p[i])
				count++;
			if(count>=3)
				break;
		}
		if(count<=2)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}