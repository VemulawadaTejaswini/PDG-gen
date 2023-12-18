ipmport  java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int count =0;

		while(sc.hasNext())
		{
			String str = sc.next();

			for(int i=0; i<str.length(); i++)
			{
				if(str.charAt(i)==str.charAt(str.length()-1-i))
				{
					if(str.length()-1-i<= i)
					{
						count++;
						break;
					}
					continue;
				}
				else
					break;
			}
		}
		System.out.println(count);

	}

}