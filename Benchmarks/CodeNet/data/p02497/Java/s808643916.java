import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			ArrayList<String> list = new ArrayList<String>();
			BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.valueOf(ds.readLine());
			for(int i = 0; i < size; i++)
			{
				String s = ds.readLine();
				if(s != null && s != "" && !s.equals("-1 -1 -1"))
				{
					list.add(s);
				} else
				{
					break;
				}
			}
			for(int i = 0; i < list.size(); i++)
			{
				String s = list.get(i);
				StringTokenizer sz = new StringTokenizer(s);
				int res = Integer.valueOf(sz.nextToken()) + Integer.valueOf(sz.nextToken());
				int rev = Integer.valueOf(sz.nextToken());
				int result = 0;
				if(res >= 80)
				{
					result = 1;
				} else
				if(res >= 65)
				{
					result = 2;
				} else
				if(res >= 50 || 50 >= rev)
				{
					result = 3;
				} else
				if(res >= 30)
				{
					result = 4;
				} else
				{
					result = 0;
				}
				System.out.println(rate[result]);
			}
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			System.out.println("Input Error");
		}
	}

	static String[] rate = new String[]
	{
		"F",
		"A",
		"B",
		"C",
		"D",
	};

	/*
	 * 中間試験、期末試験のいずれかを欠席した場合成績は F。
	中間試験と期末試験の合計点数が 80 以上ならば成績は A 。
	中間試験と期末試験の合計点数が 65 以上 80 未満ならば成績は B。
	中間試験と期末試験の合計点数が 50 以上 65 未満ならば成績は C。
	中間試験と期末試験の合計点数が 30 以上 50 未満ならば成績は D。 ただし、再試験の点数が 50 以上ならば成績は C。
	中間試験と期末試験の合計点数が 30 未満ならば成績は F。
	 * */
}