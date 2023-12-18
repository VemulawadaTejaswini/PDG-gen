import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str;
		while(!(str = sc.next()).equals("-"))
		{
			int size = sc.nextInt();
			StringBuilder ans = new StringBuilder();
			for(int i = 0; i < size; ++i)
			{
				int left = sc.nextInt();
				for(int j = left; j < str.length(); ++j)
				{
					ans.append(str.charAt(j));
				}
				
				for(int j = 0; j < left; ++j)
				{
					ans.append(str.charAt(j));
				}
				str = ans.toString();
				ans.delete(0, ans.length());
			}
			System.out.println(str);
		}
	}
}