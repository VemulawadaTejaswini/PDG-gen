import java.util.Scanner;

public class Main
{
	static public int ans100 = -1;
	static public int ans10 = -1;
	static public int ans1 = -1;
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		String[] substr = str.split(" ", 0);
		int a = Integer.parseInt(substr[0]);
		int b = Integer.parseInt(substr[1]);

		int ans = -1;
		for (int i = 1; i< 2000; i++) {
			int aa = (int)(i * 0.08);
			int bb = (int)(i *0.1);
			if (aa == a && bb == b)  {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}