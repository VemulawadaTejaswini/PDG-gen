

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int l=0;
		int r=n;
		for(int i=0;i<m;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			if(a>l)
			{
				l=a;
			}
			if(b<r) {
				r=b;
			}
			if(b<l || a>r) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(r-l+1);
	}
}
