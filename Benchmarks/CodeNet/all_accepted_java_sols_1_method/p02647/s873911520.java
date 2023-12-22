import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
		String s;
		String sl[];

		s = r.readLine();
		sl = s.split(" ");

		int n = Integer.parseInt(sl[0]);
		int k = Integer.parseInt(sl[1]);

		int a[] = new int[200001];
		int z[] = new int[200001];
		s = r.readLine();
		sl = s.split(" ");

		for(int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(sl[i]);
		}

		for(int i = 0; i < k; i++)
		{
			boolean b = true;
			for(int j = 0; j < n; j++)
			{
				z[j] = 0;
				if(a[j] < n)
				{
					b = false;
				}
			}
			if(b)
			{
				break;
			}
			for(int j = 0; j < n; j++)
			{
				if(j - a[j] < 0)
				{
					z[0]++;
				}
				else
				{
					z[j - a[j]]++;
				}

				if(j + a[j] + 1 < n)
				{
					z[j + a[j] + 1]--;
				}
			}
			a[0] = z[0];
			for(int j = 1; j < n; j++)
			{
				a[j] = a[j - 1] + z[j];
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++)
		{
			sb.append(a[i] + " ");
		}
		System.out.println(sb);
	}
}