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
		map.put(0, 0);
		while(q-- > 0)
		{
			int cmd = nint();
			if(cmd == 0)
			{
				int s = nint();
				int t = nint();
				int x = nint();
				Integer leftValue = map.floorEntry(s).getValue() + x;
				Integer rightValue = map.floorEntry(t+1).getValue();
				map.put(s, leftValue);
				map.put(t+1, rightValue);
				map.subMap(s, false, t, true).entrySet().forEach(e -> e.setValue(e.getValue() + x));
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