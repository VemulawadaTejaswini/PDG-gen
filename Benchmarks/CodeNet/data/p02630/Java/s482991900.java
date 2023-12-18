import java.util.*;
public class Main{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		long t=sc.nextInt();
		List<Long> li=new ArrayList<Long>();
		List<Long> li1=new ArrayList<Long>();
		Map<Long,Long> mp=new HashMap<>();

		for(int i=0;i<t;i++)
		{
			 li.add(sc.nextLong());
		}
		
		map1(li,mp);
		int q=sc.nextInt();
		Set<Map.Entry<Long, Long>> sp=mp.entrySet();
		
		for(int i=1;i<=q;i++)
		{
			long b=sc.nextLong();
			long c=sc.nextLong();
			for(long p:mp.keySet())
			{
				if(p==b)
				{
				   long y=mp.get(p);
					for(int k=0;k<y;k++)
					{
						 int u=li.indexOf(b);
						 li.set(u,c);
					}
				}
			}
			mp.clear();
			map1(li,mp);
			long sum=0;
			for(int k=0;k<li.size();k++)
			{
				sum=sum+li.get(k);
			}
			
			li1.add(sum);
		}
		for(int i=0;i<li1.size();i++)
		{
			System.out.println(li1.get(i));
		}
		
		
	}
	public static void map1(List<Long> li,Map<Long,Long> mp)
	{
		for(int i=0;i<li.size();i++)
		{
			if(mp.containsKey(li.get(i)))
			{
				mp.put(li.get(i),mp.get(li.get(i))+1l);
			}
			else
			{
				mp.put(li.get(i),1l);
			}
		}
	}

}
