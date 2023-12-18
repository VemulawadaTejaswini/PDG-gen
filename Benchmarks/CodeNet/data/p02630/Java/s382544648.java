import java.util.*;
public class Main{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		List<Integer> li=new ArrayList<Integer>();
		List<Integer> li1=new ArrayList<Integer>();
		Map<Integer,Integer> mp=new HashMap<>();
		int arr[]=new int[t];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			 li.add(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(mp.containsKey(arr[i]))
			{
				mp.put(arr[i],mp.get(arr[i])+1);
			}
			else
			{
				mp.put(arr[i],1);
			}
		}
		int q=sc.nextInt();
		Set<Map.Entry<Integer, Integer>> sp=mp.entrySet();
		
		for(int i=1;i<=q;i++)
		{
			int b=sc.nextInt();
			int c=sc.nextInt();
			for(int p:mp.keySet())
			{
				if(p==b)
				{
					int y=mp.get(p);
					for(int k=0;k<y;k++)
					{
						 int u=li.indexOf(b);
						 li.set(u,c);
					}
				}
			}
			mp.clear();
			for(int u=0;u<li.size();u++)
			{
				if(mp.containsKey(li.get(u)))
				{
					mp.put(li.get(u),mp.get(li.get(u))+1);
				}
				else
				{
					mp.put(li.get(u),1);
				}
			}
			int sum=0;
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

}
