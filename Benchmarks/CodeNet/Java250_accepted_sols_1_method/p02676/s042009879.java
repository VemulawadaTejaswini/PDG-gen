import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String Sa = sc.nextLine();
		String S = sc.nextLine();
		
		if(K >= S.length())
		{
			System.out.println(S);
		}
		else
		{
			String T = S.substring(0, K);
			String U = T + "...";
			System.out.println(U);
		}
	}
}
