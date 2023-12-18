import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] s = new int[1000];
		int i=0,j=0,n=0,g=0;
		double a,m,sum=0.0;
		while(true)
		{
			s[j] = sc.nextInt();
			g+=s[j];
			n++;
			if(s[j]==0)break;
			j++;
		}
		m=(double)(g/n);
		for(i=1;i<n;i++)
		{
			sum+=Math.pow(s[i]-m,2);
		}
		sum/=n;
		a=Math.sqrt(sum);
		System.out.printf("%f\n",a);
	}
}