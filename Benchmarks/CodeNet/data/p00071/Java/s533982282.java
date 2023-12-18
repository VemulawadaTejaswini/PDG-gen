import java.util.*;
class P
{
	int x;
	int y;
	P(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int count = 1;
		while(n-- != 0)
		{
			StringBuffer[] field = new StringBuffer[8];
			
			for(int i = 0; i < 8; ++i)
			{
				String temp = stdIn.next();
				field[i] = new StringBuffer(temp);
			}
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			field[y - 1].setCharAt(x - 1, '0');
			Queue<P> que = new ArrayDeque<P>();
			que.add(new P(x - 1, y - 1));
			while(!que.isEmpty())
			{
				P p = que.poll();
				for(int i = -3; i <= 3; ++i)
				{
					if(p.x + i < 0 || p.x + i >= 8)
					{
						continue;
					}
					if(field[p.y].charAt(p.x + i) == '1')
					{
						field[p.y].setCharAt(p.x + i, '0');
						que.add(new P(p.x + i, p.y));
					}
				}
				for(int i = -3; i <= 3; ++i)
				{
					if(p.y + i < 0 || p.y + i >= 8)
					{
						continue;
					}
					if(field[p.y + i].charAt(p.x) == '1')
					{
						field[p.y + i].setCharAt(p.x, '0');
						que.add(new P(p.x, p.y + i));
					}
				}
			}
			System.out.println("Data " + count + ":");
			for(int i = 0; i < 8; ++i)
			{
				System.out.println(field[i]);
			}
			++count;
		}
	}
}