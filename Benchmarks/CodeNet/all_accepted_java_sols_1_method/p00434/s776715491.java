import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean submited[] = new boolean[30];
		for (int i = 0; i < 28; i++)
		{
			submited[sc.nextInt() - 1] = true;
		}
		for (int i = 0; i < 30; i++)
		{
			if (!submited[i])System.out.println(i+1);
		}
	}
}