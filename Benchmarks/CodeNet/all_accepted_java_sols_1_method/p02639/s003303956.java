import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[5];
		for(int i=0;i<5;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		for(int i=0;i<5;i++)
		{
			if(arr[i]==0){
				System.out.println(i+1);
				break;
			}
		}
	}
}