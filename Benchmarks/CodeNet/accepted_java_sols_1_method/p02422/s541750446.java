import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException
	{
		int a,b,q;
		String str;
		String[] strPrint = new String[128];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

		str = br.readLine();

		q = Integer.parseInt(br.readLine() );

		for(int i=0; i<q; i++)
		{
			String[] strSplit = br.readLine().split(" ");

			a = Integer.parseInt(strSplit[1]);
			b = Integer.parseInt(strSplit[2]);

			if(strSplit[0].equals("replace") )
			{
				StringBuffer sb_rep = new StringBuffer(str).replace(a, b+1, strSplit[3]);
				str = sb_rep.toString();
			}
			else if(strSplit[0].equals("reverse") )
			{
				StringBuffer sb_str = new StringBuffer(str);
				StringBuffer sb_rev = new StringBuffer(str.substring(a, b+1) );

				sb_rev = sb_rev.reverse();

				StringBuffer sb_revp = sb_str.replace(a, b+1, sb_rev.toString() );
				str = sb_revp.toString();
			}
			else if(strSplit[0].equals("print") )
			{
				strPrint[i] = str.substring(a, b+1);
			}

		}

		for(String strFor : strPrint)
		{
			if(strFor != null)
			System.out.println(strFor);
		}

	}
}