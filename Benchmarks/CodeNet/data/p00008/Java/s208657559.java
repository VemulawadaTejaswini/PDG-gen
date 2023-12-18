import java.util.*;
import java.io.*;

public class Main
{
	static int getComb(int n)
	{
		int total = 0;
		for(int i = 0; i <= 9; i++)
			for(int j = 0; j <= 9; j++)
				for(int k = 0; k <= 9; k++)
					for(int z = 0; z <= 9;z++)
						if(i + j + k + z == n)
							total +=1;
		
		return total;
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = br.readLine()) != null)
		{
			int n = Integer.parseInt(s);
			System.out.println(getComb(n));
		}
	}
		
}