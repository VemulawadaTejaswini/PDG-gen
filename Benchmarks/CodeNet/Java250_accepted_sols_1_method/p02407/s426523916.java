import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int num  = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		for(int i = num-1; i>=0; i--)
		{
			System.out.print(arr[i]);
			if(i==0)	break;
			System.out.print(" ");	
		}
		System.out.println("");
	}
}