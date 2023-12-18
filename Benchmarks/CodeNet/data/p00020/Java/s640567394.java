import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		StringBuffer str = new StringBuffer(sc.nextLine());
		
		for (int i = 0; i < str.length(); i++)
		{
			char a = str.charAt(i);
			if (Character.isLowerCase(a))
				a -= 'a' - 'A';
			str.setCharAt(i, a);
		}
		System.out.println(str.toString());
	}
}