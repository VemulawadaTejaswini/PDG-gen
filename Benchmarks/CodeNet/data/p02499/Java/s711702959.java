import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			LinkedList<String> list = new LinkedList<String>();
			list.clear();
			String str = "";
			while(true)
			{
				String s = in.readLine();
				if(s != null)
				{
					str += s;
				} else
				{
					break;
				}
			}
				int[] count = getCharCounts(str);
				for(int i = 0; i < ('z' - 'a' + 1); i++)
				{
					System.out.println((char)('a'+i)+" : "+count[i]);
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static int[] getCharCounts(String s)
	{
		int[] result = new int['z'-'a'+1];
		for(int i = 0; i < s.length(); i++)
		{
			Character c = s.charAt(i);
			if(Character.isLetter(c))
			{
				c = Character.toLowerCase(c);
				int num = (int)c - 'a';
				result[num]++;
			}
		}
		return result;
	}

	private static int getCount(String s)
	{
		int result = 0;
		for(int i = 0; i < s.length(); i++)
		{
			result += Integer.valueOf(s.substring(i, i+1));
		}
		return result;
	}

	private static String getParsedString(String s)
	{
		String result = "";
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(Character.isLowerCase(c))
			{
				c = Character.toUpperCase(c);
			} else
			if(Character.isUpperCase(c))
			{
				c = Character.toLowerCase(c);
			}
			result += c;
		}
		return result;
	}

	private static int getCount(int num, int max)
	{
		int result = 0;
		LinkedList<String> buffer = new LinkedList<String>();
		buffer.clear();
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= num; j++)
			{
				for(int k = 1; k <= num; k++)
				{
					if(i + j + k == max && nEq(i, j, k))
					{
						int[] res = getSorted(i, j, k);
						String s = String.valueOf(res[0]+","+res[1]+","+res[2]);
						if(!buffer.contains(s))
						{
							buffer.add(s);
							result++;
						}
					}
				}
			}
		}
		return result;
	}

	private static boolean nEq(int i, int j, int k)
	{
		return i != j && i != k && j != k;
	}

	private static int[] getSorted(int ... param)
	{
		for(int i = 0; i < param.length - 1; i++)
		{
			for(int j = 0; j < param.length - 1 - i; j++)
			{
				if(param[j] > param[j+1])
				{
					param = swap(param.clone(), j, j+1);
				}
			}
		}
		return param;
	}

	private static int[] swap(int[] param, int i, int j)
	{
		int tmp = param[i];
		param[i] = param[j];
		param[j] = tmp;
		return param;
	}

	public static int[] getSpritIntegers(String s) throws Exception
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.clear();
		StringTokenizer sz = new StringTokenizer(s);
		while(sz.hasMoreTokens())
		{
			list.add(Integer.valueOf(sz.nextToken()));
		}
		int[] result = new int[list.size()];
		for(int i = 0; i < list.size(); i++)
		{
			result[i] = list.get(i);
		}
		return result;
	}
}