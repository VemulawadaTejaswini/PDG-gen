import java.io.*;
import java.lang.*;
import java.util.*;

public class Main 
{
	static int[] c,s,f;
	public static void main(String[] args)
	{
		c = new int[510];
		s = new int[510];
		f = new int[510];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1;i < n;++i)
		{
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}
		for (int i = 1;i <= n;++i)
		{
			int t = s[i];
			for (int j = i;j < n;++j)
			{
				if (t < s[j]) t = s[j];
				if (t % f[j] != 0) t = (t/f[j]+1)*f[j];
				t += c[j];
			}
			System.out.println(t);
		}
	}

}
