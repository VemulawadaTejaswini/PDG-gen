import java.util.Scanner;


public class Main
{
	public static void main(String[] args) 
	{
		int m,n,p;
		Scanner scanner=new Scanner(System.in);		
		n=scanner.nextInt();
		m=scanner.nextInt();
		p=scanner.nextInt();
		while(m!=0&&n!=0&&p!=0)
		{
			int [] x=new int[n];
			double money=0.0;
			for(int i=0;i<n;i++)
			{
				x[i]=scanner.nextInt();
				money+=100*x[i];
			}
			money-=money*p/100;
			if(x[m-1]==0)
				System.out.println(0);
			else
				System.out.println((int)(money/x[m-1]));
			n=scanner.nextInt();
			m=scanner.nextInt();
			p=scanner.nextInt();
		}
	}
}