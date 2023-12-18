import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long m=sc.nextLong();
		long k=sc.nextLong();
		List<Long> li=new ArrayList<Long>();
		List<Long> li1=new ArrayList<Long>();
		long sum=0;
		long count=0;
		for(int i=0;i<n;i++)
		{
			li.add(sc.nextLong());
		}
		for(int i=0;i<m;i++)
		{
			li1.add(sc.nextLong());
		}
		int x=Math.max(li.size(),li1.size());
		for(int i=0;i<x;i++)
		{
		  if(sum<k&&(li.size()!=0||li1.size()!=0))
		  {
			if(sum<k&&li.size()!=0)
			{
				sum=sum+li.get(0);
				li.remove(0);
				if(sum>=k)
				{
					if(sum==k)
					{
						count++;
					}
					break;
				}
				count++;
			}		
				if(sum<k&&li1.size()!=0)
				{
					sum=sum+li1.get(0);
					
					li1.remove(0);
					if(sum>=k)
					{
						if(sum==k)
						{
							count++;
						}
						break;
					}
					count++;
					
				}
		  }		
			else
			{
				break;
			}
			
		}
		System.out.println(count);
	}

}
