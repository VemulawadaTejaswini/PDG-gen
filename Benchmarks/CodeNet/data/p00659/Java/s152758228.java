import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			TreeMap<String, ArrayList<Integer>>TM=new TreeMap<String, ArrayList<Integer>>();
			for(int i=0;i<n;i++)
			{
				String st=in.next();
				int m=in.nextInt();
				ArrayList<Integer>AL=new ArrayList<Integer>();
				for(int j=0;j<m;j++)
					AL.add(in.nextInt());
				TM.put(st,AL);
			}
			int ans=Integer.MAX_VALUE;
			String name="";
			Iterator it = TM.keySet().iterator();
			String key[]=new String[TM.size()];
			for(int i=0;it.hasNext();i++)
				key[i]=(String)it.next();
			for(int i=0;i<key.length;i++)
			{
				ArrayList<Integer> AL2=TM.get(key[i]);
				int ref[]=new int[31];
				int cnt=0;
				for(int j=0;j<key.length;j++)
				{
					if(i==j)
						continue;
					ArrayList<Integer>AL3=TM.get(key[j]);
					for(int k=0;k<AL3.size();k++)
						ref[AL3.get(k)]++;	
				}
				for(int j=0;j<31;j++)
				{
					for(int k=0;k<AL2.size();k++)
					{
						if(AL2.get(k)==j)
							cnt+=n-ref[j];
					}
				}
				if(ans>cnt)
				{
					ans=cnt;
					name=key[i];
				}
			}
			System.out.println(ans+" "+name);
		}
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}