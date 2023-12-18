import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String original = scanner.nextLine();
		String target = "CODEFESTIVAL2016";
		int count=0;
		for (int i=0; i<16; i++)
		{
			if (original.charAt(i) != target.charAt(i))
				count++;
		}
		System.out.println(count);
	}
}
