import java.util.*;

public class Main
{
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		new Main().run();
	}

	void run()
	{
		int n = Integer.parseInt(sc.nextLine());
		while(n-- > 0)
		{
			String str = sc.nextLine();
			Parser p = new Parser(str);
			int res = p.get().need();
			System.out.println(res);
		}
	}
}

class Parser
{
	String str;
	int index = 0;

	Calcuable c;
	Deque<Calcuable> stack = new ArrayDeque<>();

	public Parser(String s)
	{
		str = s;
		c = new BlockGroup();
		stack.push(c);
		parse();
	}

	Calcuable get()
	{
		return c;
	}

	void parse()
	{
		while(true)
		{
			int r = read();
			if(r==-3) return;
			if(r == -1)
			{
				stack.pop();
			}
			else if(r == -2)
			{
				BlockGroup bg = new BlockGroup();
				((BlockGroup)stack.peek()).add(bg);
				stack.push(bg);
			}
			else
			{
				((BlockGroup) stack.peek()).add(new Block(r));
			}
		}
	}

	int read()
	{
		if(index==str.length())
		{
			return -3;
		}
		else if(str.charAt(index) == ']')
		{
			index++;
			return -1;
		}
		else if(str.charAt(index) == '[')
		{
			index++;
			return -2;
		}
		else
		{
			int v = 0;
			while(str.charAt(index) != ']')
			{
				v *= 10;
				v += (str.charAt(index) - '0');
				index++;
			}
			return v;
		}
	}

}

interface Calcuable
{
	int need();
}

class Block implements Calcuable
{
	int num;

	public Block(int n)
	{
		num = n;
	}

	@Override
	public String toString()
	{
		return Integer.toString(num);
	}

	@Override
	public int need()
	{
		return (num + 1) / 2;
	}
}

class BlockGroup implements Calcuable
{
	ArrayList<Calcuable> blocks = new ArrayList<>();

	public BlockGroup()
	{
	}

	void add(Calcuable c)
	{
		blocks.add(c);
	}

	@Override
	public String toString()
	{
		return blocks.toString();
	}

	@Override
	public int need()
	{
		int[] needs = new int[blocks.size()];
		for(int i = 0; i < needs.length; i++)
		{
			needs[i] = blocks.get(i).need();
		}
		Arrays.sort(needs);
		int sum = 0;
		int lim = (needs.length + 1) / 2;
		for(int i = 0; i < lim; i++)
			sum += needs[i];
		return sum;
	}

}