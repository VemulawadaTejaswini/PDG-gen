import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer(sc.next());
		for (int i = 0; i < str.length(); i++)
		{
			int a = str.charAt(i) - 'A';
			a -= 3;
			if (a < 0) a += 26;
			str.setCharAt(i, (char)(a + 'A')); 
		}
		System.out.println(str.toString());
	}
}