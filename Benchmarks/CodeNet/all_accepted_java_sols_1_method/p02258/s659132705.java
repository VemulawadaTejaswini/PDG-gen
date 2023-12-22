import java.util.*;

public class Main{
	public static void  main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int buy,ans,rem;
		ans = Integer.MIN_VALUE;
		
		buy = sc.nextInt();
		for(int i = 1 ; i < n ; i++ )
		{
			rem = sc.nextInt();
			ans = Math.max(ans , rem - buy);
			buy = Math.min(rem , buy );
			
		}
		
		System.out.println(ans);
		
	}
}