import java.util.*;

//aとbの比較プログラム
public class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);

		if(a>b)
		{
			System.out.println("a > b");
		}
		else if(a<b)
		{
			System.out.println("a < b");
		}
		else
		{
			System.out.println("a == b");
		}
		sc.close();
	}
}

