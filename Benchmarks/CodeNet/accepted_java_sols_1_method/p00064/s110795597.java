import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("\\D+");

		int secNum = 0;
		while(sc.hasNext())
		{
			secNum += sc.nextInt();
		}
		System.out.println(secNum);
	}
}