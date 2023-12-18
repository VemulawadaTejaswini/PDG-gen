import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] chrs = str.toCharArray();
		String[] strs = new String[chrs.length];

		for(int i=0; i<chrs.length; i++)
		{
			if(Character.isUpperCase(chrs[i]))
			{
				strs[i] = String.valueOf(chrs[i]);
				strs[i].toLowerCase();
			}
			else if(Character.isLowerCase(chrs[i]))
			{
				strs[i] = String.valueOf(chrs[i]);
				strs[i].toUpperCase();
			}
			else	strs[i] = String.valueOf(chrs[i]);
		}
		for(int i=0; i<strs.length; i++)
		{
			System.out.print(strs[i]);
		}
	}

}