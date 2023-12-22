

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException
	{
		int nCount=0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

		String strWord = br.readLine();

		while(true)
		{
			String[] strText = br.readLine().split(" ");
			if(strText[0].equals("END_OF_TEXT") ) break;

			for(String str : strText)
			{
				if(str.equalsIgnoreCase(strWord) ) nCount++;
			}
		}

		System.out.println(nCount);

	}
}