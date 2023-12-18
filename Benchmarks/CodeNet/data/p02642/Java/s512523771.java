import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		int count = 0;
		if(arr[0]==arr[n-1])
		{
			System.out.println(count);
			return;
		}
		int freq[] = new int[arr[n-1]+1];
		int prim[] = new int[arr[n-1]+1];
		for(int i=0;i<n;i++)
		{
			freq[arr[i]]++;
		}
		for(int i=0;i<n;i++)
		{
			if(prim[arr[i]]==0){
			for(int j=2*arr[i];j<=arr[n-1];j+=arr[i])
			{
				prim[j]=1;
			}
		}
		}
		for(int i=0;i<n;i++)
		{
			if(prim[arr[i]]==0 && freq[arr[i]]==1)
				count++;
		}
		System.out.println(count);

	}
}