import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int maxn = 300 + 10;

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		int a[]=new int [200000+100];
		int n=cin.nextInt();
		for(int i=0;i<n;i++)
			{a[i]=cin.nextInt();}
		Arrays.sort(a,0,n);
		boolean flag=true;
		for(int i=1;i<n;i++)
		{
			//System.out.print(a[i]+" ");
			if(a[i]==a[i-1])
				flag=false;
		}
		if(flag)
			System.out.println("YES");
		else 
			System.out.println("NO");
	}

}