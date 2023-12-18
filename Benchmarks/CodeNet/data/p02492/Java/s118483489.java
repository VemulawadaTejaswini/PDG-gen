import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		//int a = Integer.parseInt(str[0]);
		//int b = Integer.parseInt(str[2]);
		int a = new Integer(str[0]).intValue();
		int b = new Integer(str[2]).intValue();
		String op = str[1];
		int i = 0;
		
		while (sc.hasNextLine())
		{
			if (op == "?")
			{
				break;
			}
			
			if (op == "+")
			{
				i = a + b;
			}
			else if (op == "-")
			{
				i = a - b;
			}
			else if (op == "*")
			{
				i = a * b;
			}
			else if (op == "/")
			{
				i = a / b;
			}
			else
			{
				break;
			}
			
			System.out.println(i);
		}
	}
}