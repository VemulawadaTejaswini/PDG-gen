import java.util.*;
class P
{
	double time;
	int num;
	P(int num, double time)
	{
		this.num = num;
		this.time = time;
	}
}
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		List<P> a = new ArrayList<P>();
		List<P> b = new ArrayList<P>();
		List<P> c = new ArrayList<P>();
		List<P> d = new ArrayList<P>();
		for(int i = 0; i < 8; ++i)
		{
			int n = stdIn.nextInt();
			double t = stdIn.nextDouble();
			a.add(new P(n, t));
		}
		for(int i = 0; i < 8; ++i)
		{
			int n = stdIn.nextInt();
			double t = stdIn.nextDouble();
			b.add(new P(n, t));
		}
		for(int i = 0; i < 8; ++i)
		{
			int n = stdIn.nextInt();
			double t = stdIn.nextDouble();
			c.add(new P(n, t));
		}
		Collections.sort(a, new Comparator<P>()
		{ 
			public int compare(P t1, P t2)
			{
				return (t1.time - t2.time > 0 ? 1 : -1); 
			}
		} );
		Collections.sort(b, new Comparator<P>()
		{ 
			public int compare(P t1, P t2)
			{
				return (t1.time - t2.time > 0 ? 1 : -1); 
			}
		} );
		Collections.sort(c, new Comparator<P>()
		{ 
			public int compare(P t1, P t2)
			{
				return (t1.time - t2.time > 0 ? 1 : -1); 
			}
		} );
		d.add(a.get(2));
		d.add(a.get(3));
		d.add(b.get(2));
		d.add(b.get(3));
		d.add(c.get(2));
		d.add(c.get(3));
		Collections.sort(d, new Comparator<P>()
		{ 
			public int compare(P t1, P t2)
			{
				return (t1.time - t2.time > 0 ? 1 : -1); 
			}
		} );
		System.out.println(a.get(0).num + " " + a.get(0).time);
		System.out.println(a.get(1).num + " " + a.get(1).time);
		System.out.println(b.get(0).num + " " + b.get(0).time);
		System.out.println(b.get(1).num + " " + b.get(1).time);
		System.out.println(c.get(0).num + " " + c.get(0).time);
		System.out.println(c.get(1).num + " " + c.get(1).time);
		System.out.println(d.get(0).num + " " + d.get(0).time);
		System.out.println(d.get(1).num + " " + d.get(1).time);
	}
}