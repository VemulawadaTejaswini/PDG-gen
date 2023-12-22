import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String yyyy_mm_dd = sc.next();
		
		
		int month = Integer.parseInt(yyyy_mm_dd.substring(5, 7));

		
		String ans = (month >= 5) ? "TBD" : "Heisei";

		System.out.println(ans);
		sc.close();
	}
}