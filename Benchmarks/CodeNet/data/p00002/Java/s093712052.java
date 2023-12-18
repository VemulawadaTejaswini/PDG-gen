import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while(sc.nextLine() != null)
		{
			String[] s = sc.nextLine().split("[\\s]+");
			int value = Integer.parseInt(s[0]);
			int value_2 = Integer.parseInt(s[1]);
			int sum = value + value_2;
			int count = 1;
			while(sum / 10 != 0)
			{
				sum /= 10;
				count++;
			}
			System.out.println(count);
		}
	}
}