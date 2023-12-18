import java.util.*;

class P
{
	int name;
	int time;
	P(int name, int time)
	{
		this.name = name;
		this.time = time;
	}
}
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			if(n == 0)
			{
				break;
			}
			List<P> list = new ArrayList<P>();
			for(int i = 0; i < n; ++i)
			{
				int c1 = stdIn.nextInt();
				int m1 = stdIn.nextInt();
				int s1 = stdIn.nextInt();
				int m2 = stdIn.nextInt();
				int s2 = stdIn.nextInt();
				int m3 = stdIn.nextInt();
				int s3 = stdIn.nextInt();
				int m4 = stdIn.nextInt();
				int s4 = stdIn.nextInt();
				list.add(new P(c1, (m1 + m2 + m3 + m4) * 60 + (s1 + s2 + s3 + s4)));
			}
			Collections.sort(list, new Comparator<P>()
			{ 
				public int compare(P t1, P t2)
				{
					return (t1.time - t2.time); 
				}
			} );
			System.out.println(list.get(0).name);
			System.out.println(list.get(1).name);
			System.out.println(list.get(n - 2).name);
		}
	}
}