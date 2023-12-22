import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()+1;
		String s = sc.next();
		s += "*";

		int ans = 0;
		char prev = s.charAt(0);
		for(int i = 0 ; i < n ; i++){
			if(prev != s.charAt(i)){
				ans++;
				prev = s.charAt(i);
			}
		}

		System.out.println(ans);
	}
}