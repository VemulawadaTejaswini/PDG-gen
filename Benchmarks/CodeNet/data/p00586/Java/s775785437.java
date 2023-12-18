import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);

		while(sc.hasNext())
			System.out.println(sc.nextInt()+sc.nextInt());
	}
}