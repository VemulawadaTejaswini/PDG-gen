import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[]=new int[n];
		for(int k=0;k<n;k++)
			arr[k] = Integer.parseInt(st.nextToken());
		int res[] = new int[n];
		int s=arr[0]^arr[1];
		for(int i=2;i<n;i++)
			s= (s^arr[i]);
		for(int i=0;i<n;i++)
			res[i] = (s^arr[i]);
		for(int i=0;i<n;i++)
			System.out.print(res[i]+" ");
		System.out.println();

		

	}
}