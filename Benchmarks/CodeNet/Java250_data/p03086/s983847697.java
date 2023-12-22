import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		char[] c = str.toCharArray();
		int ans = 0;
		int buf = 0;
		for (int i=0; i < str.length(); i++) {
			if (c[i] == 'A' || c[i] == 'C' || c[i] == 'G' || c[i] == 'T' ) {
				buf +=1;
			} else {
				buf = 0;
			}
			if (buf > ans) ans = buf;
		}
		System.out.println(ans);
	}
}
