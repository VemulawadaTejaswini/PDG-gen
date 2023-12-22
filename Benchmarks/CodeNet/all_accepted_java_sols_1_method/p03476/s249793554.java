import java.io.*;
import java.lang.*;
import java.util.*;

public class Main 
{
	static boolean[] p;
	static int[] s;
	static final int maxn = 110000;
	public static void main(String args[])
	{
		p = new boolean[maxn];
		s = new int[maxn];
		Scanner sc = new Scanner(System.in);
		for (int i = 2;i <= 100000;++i)
		{
			if (i > 5000) break;
			for (int j = i*i;j <= 100000;j += i)
				p[j] = true;
		}
		s[1] = 0;
		for (int i = 3;i <= 100000;i += 2)
		{
			if (p[i] == false && p[(i+1)>>1] == false) s[i] = 1;
		}
		for (int i = 3;i <= 100000;++i)
		{
			s[i] = s[i-1] + s[i];
		}
		int q = sc.nextInt();
		while (q-- != 0)
		{
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(s[r]-s[l-1]);
		}
	}
}
