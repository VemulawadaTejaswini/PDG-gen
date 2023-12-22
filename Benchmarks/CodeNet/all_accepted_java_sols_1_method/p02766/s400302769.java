import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] substr = str.split(" ", 0);


		String s = substr[0];
		int n = Integer.parseInt(substr[0]);
		int k = Integer.parseInt(substr[1]);
		int i = 1;
		int target = k;
		while (true) {

			if (n < target) {
				break;
			}
			target = target * k;
			i++;

		}
		scan.close();
		System.out.println(i);
	}
}