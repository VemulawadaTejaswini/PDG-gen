import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		String str1[] = input(1);
		String str2[] = input(Integer.parseInt(str1[0]));
		String str3[] = input(1);
		String str4[] = input(Integer.parseInt(str3[0]));

		int ai[] = new int[Integer.parseInt(str1[0])];
		int bi[] = new int[Integer.parseInt(str3[0])];

		for(int i = 0; i < ai.length; i++)
		{
			ai[i] = Integer.parseInt(str2[i]);
		}

		for(int i = 0; i < bi.length; i++)
		{
			bi[i] = Integer.parseInt(str4[i]);
		}

		int temp = 0;

		for(int i = 0; i < bi.length; i++)
		{
			if(SeparateSearch(ai, bi[i], 0, ai.length-1)) temp++;
			//System.out.println(temp);
		}
		System.out.println(temp);
	}

	public static boolean SeparateSearch(int[] a, int b, int first, int end)
	{
		if(end - first <= 1)
		{
			if(a[first] == b) return true;
			else if(a[end] == b) return true;
			else return false;
		}
		else
		{
			int temp = (end + first) / 2;
			//System.out.println(a[temp] + " " + b + " " + first + " " + end + " " + (a[temp] < b));
			if(a[temp] == b) return true;
			else if(a[temp] < b) return SeparateSearch(a, b, temp, end);
			else return SeparateSearch(a, b, first, temp);
		}
	}

	public static int GCD(int x, int y)
	{
		int z = Math.max(x, y) % Math.min(x, y);
		if(z == 0) return Math.min(x, y);
		return GCD(z, Math.min(y, x));
	}

	public static String[] input(int Num) throws IOException
	{
		String str[] = new String[Num];
		String str2 = br.readLine();
		int j = 0;
		for(int i = 0; i < Num; i++)
		{
			if(i < Num - 1)
			{
				str[i] = str2.substring(j, str2.indexOf(" ", j));
				j = str2.indexOf(" ", j) + 1;
			}
			else
			{
				str[i] = str2.substring(j);
			}
		}
		return str;
	}

}

