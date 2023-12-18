import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans = 0;
		int prevB = sc.nextInt();
		int now = 0;
		ans += prevB;

		for(int i = 1; i < n-1 ; i++){
			now = sc.nextInt();
			ans += (int)(Math.min(now,prevB));
			prevB = now;
		}

		ans += prevB;

		System.out.println(ans);
	}
}