import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = sc.nextInt();

		if(num - num1*2 <= 0)
			System.out.print(0);
		else
			System.out.print(num - num1*2);
	}
}