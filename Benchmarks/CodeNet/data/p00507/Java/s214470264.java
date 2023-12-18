import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			int a[]=new int[n];
			ArrayList<Integer>AL=new ArrayList<Integer>();
			ArrayList<Integer>AL2=new ArrayList<Integer>();
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			Arrays.sort(a);
			for(int i=0;i<a.length;i++)
			{
				AL.add(a[i]);
				if(i==3)
					break;
			}
			for(int i=0;i<AL.size();i++)
				for(int j=0;j<AL.size();j++)
				{
					if(i==j)
						continue;
					AL2.add(Integer.valueOf(AL.get(i)+""+AL.get(j)));
				}
			Collections.sort(AL2);
			System.out.println(AL2.get(2));
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}