import java.util.*;
public class Main{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int output = 0;
		for (int i = 1; i < input+1; i++)
		{
			output+=i;
		}
		System.out.print(output);
	}
}