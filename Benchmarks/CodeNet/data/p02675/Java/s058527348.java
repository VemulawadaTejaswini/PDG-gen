
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int v = sc.nextInt();
		String out = "hon";

		switch(v % 10)
		{
		case 0:
			out = "pon";
			break;
		case 1:
			out = "pon";
			break;
		case 6:
			out = "pon";
			break;
		case 8:
			out = "pon";
			break;
		case 3:
			out = "bon";
			break;
		}

		System.out.println(out);
	}
}

