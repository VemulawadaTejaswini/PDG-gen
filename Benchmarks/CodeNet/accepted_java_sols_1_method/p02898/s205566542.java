import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int constraint = sc.nextInt();

		int[] friends = new int[num];
		int counter = 0;
		for(int i = 0;i<friends.length; i++)
		{
			friends[i] = sc.nextInt();
			if(friends[i] >= constraint)
				counter++;

		}
		System.out.println(counter);
	}
}