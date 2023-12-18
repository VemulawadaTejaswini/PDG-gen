import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		
		String S = sc.nextLine();
		String T = sc.nextLine();
		
		String U = T.substring(0, (T.length() - 1));
		
		if(S.equals(U))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}