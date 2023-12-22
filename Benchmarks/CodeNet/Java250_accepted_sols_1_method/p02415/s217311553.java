import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\n");
		String str = scan.next();
		char[] ans = str.toCharArray();
		
		for(int i = 0;i < ans.length;i++)
		{
			if(Character.isLowerCase(ans[i]))
			{
				ans[i] = Character.toUpperCase(ans[i]);
			}else if(Character.isUpperCase(ans[i])){
				ans[i] = Character.toLowerCase(ans[i]);
			}
		}
		
		for(int i = 0;i < ans.length;i++)
		{
			System.out.print(ans[i]);
		}
		System.out.println("");
	}
}