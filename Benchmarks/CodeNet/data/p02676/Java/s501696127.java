import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc2.nextLine();
		
		if(K >= S.length())
		{
			System.out.println(S);
		}
		else
		{
			String T = S.substring(0, K);
			System.out.println(T + "...");
		}
	}
}
