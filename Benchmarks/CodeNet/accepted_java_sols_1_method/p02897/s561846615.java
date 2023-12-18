import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double num = sc.nextInt();

		if(num%2 == 0)
		{
			System.out.println(((num/2)/num));
		}
		else
		{
			System.out.println((((int)num/2+1))/num);
		}
	}
}