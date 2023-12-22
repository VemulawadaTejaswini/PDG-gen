import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = null;
		while(!(str = sc.next()).equals("0"))
		{
			int sum = 0;
			for(int i = 0; i < str.length(); ++i)
			{
				sum += str.charAt(i) - '0';
			}
			System.out.println(sum);
		}
	}
}