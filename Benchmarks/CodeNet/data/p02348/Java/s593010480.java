import java.util.Scanner;
import java.util.TreeMap;

// Java8
public class Main
{
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception
	{

		new Main().run();
	}

	void run()
	{
		nint();
		int q = nint();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		map.put(-1, Integer.MAX_VALUE);
		while(q-- > 0)
		{
			int cmd = nint();
			if(cmd == 0)
			{
				int s = nint();
				int t = nint();
				int x = nint();
				Integer rightValue = map.floorEntry(t+1).getValue();
				map.subMap(s, t+1).clear();
				map.put(s, x);
				map.put(t+1, rightValue);
			}
			else
			{
				int i = nint();
				System.out.println(map.floorEntry(i).getValue());
			}
		}
	}

	int nint()
	{
		return Integer.parseInt(sc.next());
	}
}