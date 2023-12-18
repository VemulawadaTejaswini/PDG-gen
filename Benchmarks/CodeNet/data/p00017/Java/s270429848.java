import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			try
			{
				StringBuffer str = new StringBuffer(sc.nextLine());
			
				while (str.indexOf("the") == -1 || str.indexOf("this") == -1 || str.indexOf("that") == -1)
				{
					for (int i = 0; i < str.length(); i++)
					{
						char a = str.charAt(i);
						if (Character.isLowerCase(a))
						{
							if (a == 'z') a = 'a';
							else a++;
						}
						str.setCharAt(i, a); 
					}
				}
				System.out.println(str.toString());
			}
			catch (Exception e)
			{
				break;
			}
		}
	}
}