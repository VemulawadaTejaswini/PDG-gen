import java.util.Scanner;
import java.math.BigInteger;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[+=\n]");
		while (sc.hasNext())
		{
			String str[] = new String[3];
			int start = 0;
			for (int i = 0; i < 3; i++)
			{
				str[i] = sc.next();
				if (str[i].length() > 1 && str[i].indexOf("X") == 0)
				{
					start = 1;
				}
			}
			boolean flg = false;
			for (int i = start; i < 10; i++)
			{
				StringBuffer strb[] = new StringBuffer[3];
				for (int j = 0; j < 3; j++)
				{
					strb[j] = new StringBuffer(str[j].replaceAll("X", Integer.toString(i)));
				}
				BigInteger a = new BigInteger(strb[0].toString());
				BigInteger b = new BigInteger(strb[1].toString());
				BigInteger c = new BigInteger(strb[2].toString());
				if (a.add(b).equals(c))
				{
					System.out.println(i);
					flg = true;
					break;
				}
			}
			if (!flg)
			{
				System.out.println("NA");
			}
		}
	}
}