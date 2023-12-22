import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		DecimalFormat df = new DecimalFormat("#,###.##");

		int N = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine(), answer = "No";

		if(S.substring(0,(N/2)).equals(S.substring(N/2)))
			answer = "Yes";


		System.out.println(answer);
	}
}