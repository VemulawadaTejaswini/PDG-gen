import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine())
		{
			String[] str = sc.nextLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[2]);
			String op = str[1];
			
			if (op == "+")
			{
				System.out.println(Integer.toString(a + b));
			}
			else if (op == "-")
			{
				System.out.println(Integer.toString(a - b));
			}
			else if (op == "*")
			{
				System.out.println(Integer.toString(a * b));
			}
			else if (op == "/")
			{
				System.out.println(Integer.toString(a / b));
			}
			else if (op == "?")
			{
				break;
			}
		}
	}
}