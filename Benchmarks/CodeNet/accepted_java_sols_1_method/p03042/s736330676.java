import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int num = Integer.parseInt(sc.next());

		boolean yymm = (1 <= num % 100) && (num % 100 <= 12);
		boolean mmyy = (1 <= num / 100) && (num / 100 <= 12);

		String s = (yymm && mmyy) ? "AMBIGUOUS" :
				   (yymm && !mmyy) ? "YYMM" :
				   (!yymm && mmyy) ? "MMYY" :
				   (!yymm && !mmyy) ? "NA" : "";


		System.out.println(s);

		sc.close();
	}
}
