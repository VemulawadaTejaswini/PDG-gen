import java.util.*;

public class Main
{
	public static void main(String Args[])
	{
		int m,n;
		Scanner s1=new Scanner(System.in);
		n=s1.nextInt();
		m=s1.nextInt();
		Vector<Integer> v= new Vector<Integer>();
		for(int i=0; i<n+1; i++)
		{
			v.add(-1);
		}
		if(n==1 && m==0)
		{
			System.out.println("0");
		}
		else 
		{
			for(int i=0;i<m;i++)
			{
				int pos,num;
				pos=s1.nextInt();
				num=s1.nextInt();
				
				if(v.get(pos)==-1)
				{
					v.set(pos,num);
				}
				else if(v.get(pos)!=num)
				{
					System.out.println("-1");
					System.exit(0);
				}
			}
			if(v.get(1)==0 && n==1)
			{
				System.out.println("0");
			}
			else if(v.get(1)==0 && n!=1)
			{
				System.out.println("-1");
			}
			else
			{
				for(int j=1;j<n+1;j++)
				{
					if(v.get(j)==-1)
					{
						if(j==1)
						{
							System.out.print("1");
						}
						else
						{
							System.out.print("0");
						}
					}
					else
					{
						System.out.print(v.get(j));
					}
				}
			}				
		}
	}
}