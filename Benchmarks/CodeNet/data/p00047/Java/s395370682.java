import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[,\n]");
		boolean cups[] = new boolean[3];
		cups[0] = true;
		
		while (true)
		{
			try
			{
				int index1 = sc.next().charAt(0) - 'A';
				int index2 = sc.next().charAt(0) - 'A';
				boolean tmp = cups[index1];
				cups[index1] = cups[index2];
				cups[index2] = tmp;
			}
			catch (Exception e)
			{
				break;
			}
		}
		for (int i = 0; i < 3; i++)
		{
			if (cups[i])
			{
				System.out.println((char)(i + 'A'));
			}
		}
	}
}