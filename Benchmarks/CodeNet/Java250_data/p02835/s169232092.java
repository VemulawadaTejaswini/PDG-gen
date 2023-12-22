import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();

		if(i+j+k >= 22)
			System.out.println("bust");
		else
			System.out.println("win");
	}
}