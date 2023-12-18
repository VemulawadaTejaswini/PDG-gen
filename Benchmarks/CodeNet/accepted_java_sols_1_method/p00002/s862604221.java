import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();)
		{
			System.out.println(Integer.toString(sc.nextInt() + sc.nextInt()).length());
		}
	}
}