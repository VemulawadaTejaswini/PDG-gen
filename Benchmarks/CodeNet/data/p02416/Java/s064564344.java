import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int d, sum;
		while (true)
		{
			d = input.nextInt();
			if(d == 0)
				break;
			else {
				sum = 0;
				while (d>0)
				{
					sum += d%10;
					d /= 10;
				}
				System.out.println(sum);
			}
		}
	}
}