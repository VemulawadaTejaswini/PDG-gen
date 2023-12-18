import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			if(n==0)
				return;
			int a[]= new int[n];
			int b[]= new int[n];

			int j=0;
			while(n-->0)
			{
				a[j] = sc.nextInt();
				b[j] = sc.nextInt()*60+sc.nextInt()+sc.nextInt()*60+sc.nextInt()+sc.nextInt()*60+sc.nextInt()+sc.nextInt()*60+sc.nextInt();
				j++;
			}
			
			for(int i=0; i<b.length; i++)
			{
				int m=i;
				for(int k=i+1; k<b.length; k++)
				{
					if(b[m] >b[k])
						m=k;
				}
				int tmp = b[i];
				int tmp2 =a[i];
				b[i]= b[m];
				a[i]=a[m];
				b[m] = tmp;
				a[m]=tmp2;
			}
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[a.length-2]);
		}
	}
}