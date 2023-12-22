import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	
	public static void main(String[] args) throws IOException
	{
		int[] azArray = new int[26];
		char ch = 'a';

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

		while(true)
		{
			String str = br.readLine();

			if(str==null) break;

			char[] cArray = str.toCharArray();

			for(int n : cArray)
			{
				for(int i=0; i<azArray.length; i++)
				{
					if(n==65+i || n==(97+i) ) azArray[i]++;
				}
			}
		}
		
		for(int n : azArray) System.out.printf("%c : %d\n",ch++,n);
	}
}