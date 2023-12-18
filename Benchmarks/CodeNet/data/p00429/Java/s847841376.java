import java.util.*;
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
			String str = stdIn.next();
			char[] s = new char[100000];
			s = str.toCharArray();
			for(int i = 0; i < n; ++i)
			{
				String s2 = new String();
				int pos = 0;
				while(pos < s.length)
				{
					int count = 0;
					char c = s[pos];
					while(pos < s.length && c == s[pos])
					{
						++count;
						++pos;
					}
					List<Character> list = new ArrayList<Character>();
					while(count >= 10)
					{
						list.add((char)(count % 10 + '0'));
						count /= 10;
					}
					list.add((char)(count % 10 + '0'));
					for(int j = list.size() - 1; j >= 0; --j)
					{
						s2 += list.get(j);
					}
					s2 += c;
				}
				s = s2.toCharArray();
			}
			System.out.println(s);
		}
	}
}