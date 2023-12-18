
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner sc = new Scanner(System.in);
		int n,w,d;
		while(true) {
			List<Cake> ls = new LinkedList<>();
		n = sc.nextInt();
		w = sc.nextInt();
		d = sc.nextInt();
		if(w == 0)
			break;
		ls.add(new Cake(w,d));
		for(int i = 0;i < n;i++)
		{
			int p,s;
			p = sc.nextInt();
			s = sc.nextInt();
			Cake tmp = ls.get(p-1);
			ls.remove(p-1);
			Cake[] cakes = tmp.cut(s);
			if(cakes[0].menseki() > cakes[1].menseki())
			{
				ls.add(cakes[1]);
				ls.add(cakes[0]);
			}
			else
			{
				ls.add(cakes[0]);
				ls.add(cakes[1]);
			}
		}
		ls.sort(Comparator.comparing(e -> e.menseki()));
		String tab= "";
		for(int i = 0;i < ls.size();i++)
		{
			System.out.print(tab + ls.get(i).menseki());
			tab = " ";
		}
		System.out.print("\n");
		}
	}

}
class Cake {
	int w,d;
	Cake(int w,int d)
	{
		this.w = w;
		this.d = d;
	}
	int menseki()
	{
		return w * d;
	}
	Cake[] cut (int s)
	{
		int cutpoint = s % (w + d);
		if(cutpoint > w)
		{
			Cake[] cakes = new Cake[2];
			cakes[0] = new Cake(w,d-(cutpoint-w));
			cakes[1] = new Cake(w,cutpoint-w);
			return cakes;
		}
		else
		{
			Cake[] cakes = new Cake[2];
			cakes[0] = new Cake(w-cutpoint,d);
			cakes[1] = new Cake(cutpoint,d);
			return cakes;
		}

	}

}