
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		while(true)
		{
			String str = stdIn.next();
			
			if(str.charAt(0) == '0')
			{
				break;
			}
			
			int ans = 0;
			
			for(int i=0;i<str.length();i++)
			{
				ans += (int)str.charAt(i)-48;
			}
			
			System.out.println(ans);
			
		}
	}
}