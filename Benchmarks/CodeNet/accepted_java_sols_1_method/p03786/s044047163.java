import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = Integer.parseInt(br.readLine());
		long[] a = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++)
			a[i] = Long.parseLong(st.nextToken());
		Arrays.sort(a);
		long[] pre = new long[n];
		pre[0] = a[0];
		for(int i = 1; i < n; i++)
			pre[i] = pre[i-1] + a[i];
		int i = n-1;
		while(i >= 1 && 2*pre[i-1] >= a[i])
			i--;
		pw.println(n-i);
		br.close();
		pw.close();
		System.exit(0);
	}
}